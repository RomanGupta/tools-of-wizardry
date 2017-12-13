package de.rge.basic.solver.impl;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import de.rge.basic.solver.SacredGeometrySolver;
import de.rge.basic.solver.data.DataResultMaps;

public class SacredGeometrySolverImplTest {

	private SacredGeometrySolver sut = new SacredGeometrySolverImpl();

	@Test
	public void solve_theory() {
		for(int spellLevel = 1; spellLevel <= 9; spellLevel++) {
			for(int noOfValues = 1; noOfValues <= 4; noOfValues++) {
				executeTests(spellLevel, noOfValues);
			}
		}
	}

	private void executeTests(int spellLevel, int noOfValues) {
		Map<List<Integer>, Boolean> expectedResults = retrieveExpectedResultData(spellLevel, noOfValues);
		for(Map.Entry<List<Integer>, Boolean> dataEntry : expectedResults.entrySet()) {
			executeTest(dataEntry.getValue(), spellLevel, dataEntry.getKey());
		}
	}

	private Map<List<Integer>, Boolean> retrieveExpectedResultData(int ctrSpellLevel, int ctrNoOfValues) {
		return DataResultMaps.SPELL_LEVEL_AND_NO_OF_VALUES_TO_EXPECTED_RESULTS.get(new SimpleEntry<>(ctrSpellLevel, ctrNoOfValues));
	}

	private void executeTest(Boolean expectedResult, Integer spellLevel, List<Integer> values) {
		Boolean result = sut.solve(spellLevel, values);
		Assert.assertEquals("Values: " + values + " for SpellLevel " + spellLevel, expectedResult, result);
	}

}
