package de.rge.basic.solver;

import java.util.List;

public interface SacredGeometrySolver {
	Boolean solve(Integer spellLevel, List<Integer> values);
	
	String printSolution();

}
