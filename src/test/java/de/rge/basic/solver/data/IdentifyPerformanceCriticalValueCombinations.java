package de.rge.basic.solver.data;

import static de.rge.basic.util.PermutationUtil.RANGE_1_TO_8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.rge.basic.solver.SacredGeometrySolver;
import de.rge.basic.solver.impl.SacredGeometrySolverImpl;
import de.rge.basic.util.PermutationUtil;

public class IdentifyPerformanceCriticalValueCombinations {
	
	private static double UPPER_BOUND_IN_SECONDS = 0.250;

	private static int SPELL_LEVEL_BEGIN = 1;
	private static int SPELL_LEVEL_END = 9;
	private static int NO_OF_VALUES_BEGIN = 1;
	private static int NO_OF_VALUES_END = 14;
	private static int VALUE_RANGE = RANGE_1_TO_8;

	private SacredGeometrySolver sacredGeometrySolver = new SacredGeometrySolverImpl();

	private PermutationUtil permutationUtil = new PermutationUtil();

	@Test
	public void identifyPerformanceIssues() {
		for (int spellLevel = SPELL_LEVEL_BEGIN; spellLevel <= SPELL_LEVEL_END; spellLevel++) {
			System.out.println("***** Spell Level " + spellLevel + " *****");
			identifyPerformanceIssues(spellLevel);
		}
	}

	private void identifyPerformanceIssues(int spellLevel) {
		for (int noOfValues = NO_OF_VALUES_BEGIN; noOfValues <= NO_OF_VALUES_END; noOfValues++) {
			System.out.printf("--> No of Dice %2d", noOfValues);
			long maxTime = testPerformanceIssues(spellLevel, initializeValues(noOfValues));
			System.out.printf("\tmaxTime: %12f\n", maxTime/10E9);
		}
	}

	private List<Integer> initializeValues(int noOfValues) {
		List<Integer> values = new ArrayList<>(noOfValues);
		for (int ctr = 0; ctr < noOfValues - 1; ctr++) {
			values.add(1);
		}
		values.add(0);
		return values;
	}

	private long testPerformanceIssues(Integer spellLevel, List<Integer> values) {
		long maxTime = 0L;
		while (permutationUtil.hasNextCombination(values, VALUE_RANGE)) {
			permutationUtil.setNextCombination(values, values.size() - 1, VALUE_RANGE);
			long startTime = System.nanoTime();
			sacredGeometrySolver.solve(spellLevel, values);
			long totalTime = System.nanoTime() - startTime;
			maxTime = totalTime > maxTime ? totalTime : maxTime;
			if(totalTime > UPPER_BOUND_IN_SECONDS * 10E9 ) {
				System.out.printf("Time: %12f\tSpellLevel: %d\tValues: %s\n", totalTime/10E9, spellLevel, values );
			}
		}
		return maxTime;
	}
}
