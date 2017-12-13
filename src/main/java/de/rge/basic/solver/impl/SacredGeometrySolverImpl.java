package de.rge.basic.solver.impl;

import static de.rge.basic.solver.AlgebraicOperation.ADDITION;
import static de.rge.basic.solver.AlgebraicOperation.DIVISION;
import static de.rge.basic.solver.AlgebraicOperation.MULTIPLICATION;
import static de.rge.basic.solver.AlgebraicOperation.SUBTRACTION;
import static de.rge.data.SpellLevelPrimeNumbers.MAP_SPELL_LEVEL_TO_PRIME_NUMBERS;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import de.rge.basic.solver.AlgebraicOperation;
import de.rge.basic.solver.SacredGeometrySolver;
import de.rge.basic.solver.SolutionPrinter;
import de.rge.data.FailureResultSets;

public class SacredGeometrySolverImpl implements SacredGeometrySolver {

	private Integer spellLevel;
	
	private List<Integer> targets;

	private SolutionPrinter solutionPrinter = new SolutionPrinterImpl();

	@Override
	public Boolean solve(Integer spellLevel, List<Integer> values) {
		initializeState(spellLevel);
		values = prepareValues(values);
		return isProblemSolvable(values);
	}

	private void initializeState(Integer spellLevel) {
		this.spellLevel = spellLevel;
		targets = MAP_SPELL_LEVEL_TO_PRIME_NUMBERS.get(spellLevel);
		solutionPrinter.reset();
	}

	private List<Integer> prepareValues(List<Integer> values) {
		List<Integer> preparedValues = new ArrayList<Integer>(values);
		Collections.sort(preparedValues);
		return preparedValues;
	}

	private Boolean isProblemSolvable(List<Integer> values) {
		return FailureResultSets.isSolvable(spellLevel, values)
				&& (checkIfAnyTargetWasHit(values) || applyAlgebraicOperations(values));
	}

	private Boolean checkIfAnyTargetWasHit(List<Integer> temporaryResults) {
		if (temporaryResults.size() <= 1) {
			for (Integer target : targets) {
				if (temporaryResults.contains(target)) {
					solutionPrinter.init(target);
					return true;
				}
			}
		}
		return false;
	}

	private Boolean applyAlgebraicOperations(List<Integer> values) {
		List<Integer> valuesAsArrayList = new ArrayList<>(values);
		for (Entry<Integer, Integer> pair : predeterminePairCombinations(valuesAsArrayList)) {
			for (AlgebraicOperation operation : predetermineOperationOrder(valuesAsArrayList, pair)) {
				if (applyAlgebraicOperation(valuesAsArrayList, pair.getKey(), pair.getValue(), operation)) {
					return true;
				}
			}
		}
		return false;
	}

	private List<AlgebraicOperation> predetermineOperationOrder(List<Integer> values, Entry<Integer, Integer> pair) {
		Integer operand1 = values.get(pair.getKey());
		Integer operand2 = values.get(pair.getValue());
		List<AlgebraicOperation> operationOrder = new ArrayList<>();
		operationOrder.add(ADDITION);
		operationOrder.add(isMultiplicationFavorable(operand1, operand2) ? 0 : 1, MULTIPLICATION); 
		if (operand1 != operand2 || !values.contains(0)) {
			operationOrder.add(SUBTRACTION);
		}
		if(operand2 != 0 && operand1 % operand2 == 0) {
			operationOrder.add(DIVISION);
		}
		return operationOrder;
	}

	private Boolean isMultiplicationFavorable(Integer operand1, Integer operand2) {
		Integer sum = operand1 + operand2;
		Integer product = operand1 * operand2;
		return sum < targets.get(1) && sum < product;
	}

	private List<Entry<Integer, Integer>> predeterminePairCombinations(List<Integer> values) {
		List<Entry<Integer, Integer>> pairCombinations = new ArrayList<>();
		Integer lastOperand2 = Integer.MIN_VALUE;
		for (int ctrOperand2 = 0; ctrOperand2 < values.size() - 1; ctrOperand2++) {
			if (lastOperand2 != values.get(ctrOperand2)) {
				pairCombinations.addAll(predeterminePairCombinations(values, ctrOperand2));
				lastOperand2 = values.get(ctrOperand2);
			}
		}
		return pairCombinations;
	}

	// ctrOperand1 is supposed to be bigger than ctrOperand2 in an ordered list
	// - in compliance with AlgebraicOperations,
	// hence the following variable naming/order
	private List<Entry<Integer, Integer>> predeterminePairCombinations(List<Integer> values, int ctrOperand2) {
		LinkedList<Entry<Integer, Integer>> pairCombinations = new LinkedList<>();
		Integer lastOperand1 = Integer.MIN_VALUE;
		for (int ctrOperand1 = ctrOperand2 + 1; ctrOperand1 < values.size(); ctrOperand1++) {
			if (lastOperand1 != values.get(ctrOperand1)) {
				if (isCombinationFavorable(values.get(ctrOperand1), values.get(ctrOperand2))) {
					pairCombinations.addFirst(new SimpleEntry<>(ctrOperand1, ctrOperand2));
				} else {
					pairCombinations.addLast(new SimpleEntry<>(ctrOperand1, ctrOperand2));
				}
				lastOperand1 = values.get(ctrOperand1);
			}
		}
		return pairCombinations;
	}

	// Pairs are favorable when they sum up to three, three's are the backbone
	// of any minimal solution.
	private boolean isCombinationFavorable(Integer operand1, Integer operand2) {
		return operand1 + operand2 == 3;
	}

	private Boolean applyAlgebraicOperation(List<Integer> valuesAsArrayList, int ctrOperand1, int ctrOperand2,
			AlgebraicOperation operation) {
		Integer operand1 = valuesAsArrayList.get(ctrOperand1);
		Integer operand2 = valuesAsArrayList.get(ctrOperand2);

		LinkedList<Integer> valuesCopy = new LinkedList<>(valuesAsArrayList);
		valuesCopy.remove(ctrOperand1);
		valuesCopy.remove(ctrOperand2);
		Integer result = operation.execute(operand1, operand2);
		valuesCopy.add(result);
		Collections.sort(valuesCopy);
		if (isProblemSolvable(valuesCopy)) {
			solutionPrinter.addOperation(result, operation, operand1, operand2);
			return true;
		}
		return false;
	}

	@Override
	public String printSolution() {
		return solutionPrinter.print();
	}
}
