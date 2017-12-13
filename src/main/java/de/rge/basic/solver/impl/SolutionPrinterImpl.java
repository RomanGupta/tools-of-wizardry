package de.rge.basic.solver.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import de.rge.basic.solver.AlgebraicOperation;
import de.rge.basic.solver.SolutionPrinter;

public class SolutionPrinterImpl implements SolutionPrinter {
	private static Map<Integer, String> MAP_OPERATION_CODE_TO_PRINT_STRING;
	static {
		Map<Integer, String> temp = new HashMap<>();
		temp.put(-1, " + ");
		temp.put(-2, " - ");
		temp.put(-3, " * ");
		temp.put(-4, " / ");
		temp.put(-5, " = ");
		temp.put(-6, "(");
		temp.put(-7, ")");
		MAP_OPERATION_CODE_TO_PRINT_STRING = Collections.unmodifiableMap(temp);
	}

	LinkedList<Integer> encodedSolution = new LinkedList<>();

	@Override
	public void addOperation(Integer result, AlgebraicOperation operation, Integer... operands) {
		int resultFoundAt = handleResult(result);
		encodeOperationAndOperands(resultFoundAt, operation, operands);
	}

	private int handleResult(Integer result) {
		int resultFoundAt = encodedSolution.indexOf(result);
		encodedSolution.remove(resultFoundAt);
		return resultFoundAt;
	}

	private void encodeOperationAndOperands(int resultFoundAt, AlgebraicOperation operation, Integer... operands) {
		Boolean requireBraces = areBracesRequired(resultFoundAt, operation);
		operation = adjustOperation(resultFoundAt, operation, requireBraces);
		if(requireBraces) {
			encodedSolution.add(resultFoundAt++, -6);
		}
		encodedSolution.add(resultFoundAt++ , operands[0]);
		for(int ctr = 1; ctr < operands.length; ctr++) {
			encodedSolution.add(resultFoundAt++, encodeOperation(operation));
			encodedSolution.add(resultFoundAt++, operands[ctr]);
		}
		if(requireBraces) {
			encodedSolution.add(resultFoundAt++, -7);
		}
	}

	private AlgebraicOperation adjustOperation(int resultFoundAt, AlgebraicOperation operation, Boolean requireBraces) {
		if(resultFoundAt > 0 && -2 == encodedSolution.get(resultFoundAt - 1) && operation.isLineOperation() && !requireBraces) {
			return operation.getCounterOperation();
		}
		return operation;
	}

	private Boolean areBracesRequired(int resultFoundAt, AlgebraicOperation operation) {
		return checkBracesLeftSide(resultFoundAt, operation) 
			|| checkBracesRightSide(resultFoundAt, operation);
	}

	private Boolean checkBracesLeftSide(int resultFoundAt, AlgebraicOperation operation) {
		if(0 == resultFoundAt) {
			return false;
		}
		Integer leftSideOperation = encodedSolution.get(resultFoundAt - 1);
		return (operation.isLineOperation() && isDotOperation(leftSideOperation))
				|| (operation.isDotOperation() && -4 == leftSideOperation);
	}

	private boolean checkBracesRightSide(int resultFoundAt, AlgebraicOperation operation) {
		Integer rightSideOperation = encodedSolution.get(resultFoundAt); // result already removed therefore NOT + 1
		return operation.isLineOperation() && isDotOperation(rightSideOperation);
	}
	
	private boolean isDotOperation(int encodedOperation) {
		return -3 == encodedOperation || -4 == encodedOperation;
	}

	private Integer encodeOperation(AlgebraicOperation operation) {
		return (operation.ordinal() + 1) * -1;
	}

	@Override
	public void init(Integer result) {
		reset();
		encodedSolution.add(result);
		encodedSolution.add(-5);
		encodedSolution.add(result);
	}

	@Override
	public String print() {
		String result = "";
		for (Integer item : encodedSolution) {
			result += item >= 0 ? item : MAP_OPERATION_CODE_TO_PRINT_STRING.get(item);
		}
		return result;
	}

	@Override
	public void reset() {
		encodedSolution.clear();
		
	}

}
