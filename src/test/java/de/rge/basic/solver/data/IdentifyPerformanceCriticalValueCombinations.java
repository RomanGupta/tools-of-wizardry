package de.rge.basic.solver.data;

import static de.rge.basic.util.PermutationUtil.RANGE_1_TO_8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import de.rge.basic.solver.SacredGeometrySolver;
import de.rge.basic.solver.impl.SacredGeometrySolverImpl;
import de.rge.basic.util.PermutationUtil;

@Ignore
public class IdentifyPerformanceCriticalValueCombinations {
	
	private static double UPPER_BOUND_IN_SECONDS = 0.250;

	private static int SPELL_LEVEL_BEGIN = 1;
	private static int SPELL_LEVEL_END = 9;
	private static int NO_OF_VALUES_BEGIN = 1;
	private static int NO_OF_VALUES_END = 14;
	private static int VALUE_RANGE = RANGE_1_TO_8;

	private SacredGeometrySolver sacredGeometrySolver = new SacredGeometrySolverImpl();

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
			long maxTime = testPerformanceIssues(spellLevel, noOfValues);
			System.out.printf("\tmaxTime: %12f\n", maxTime/10E9);
		}
	}

	private long testPerformanceIssues(Integer spellLevel, int noOfValues) {
		long maxTime = 0L;
		PermutationUtil permutationUtil = new PermutationUtil(noOfValues, VALUE_RANGE);
		while (permutationUtil.hasNextCombination()) {
			List<Integer> values = permutationUtil.getNextCombination();
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
