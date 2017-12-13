package de.rge.basic.solver;

public interface SolutionPrinter {
	
	void addOperation(Integer result, AlgebraicOperation operation, Integer... operands);
	
	void init(Integer result);
	
	String print();
	
	void reset();
}
