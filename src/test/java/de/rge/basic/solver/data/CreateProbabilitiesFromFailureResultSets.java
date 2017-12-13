package de.rge.basic.solver.data;

import org.junit.Ignore;
import org.junit.Test;

import de.rge.data.FailureResultSets;

@Ignore
public class CreateProbabilitiesFromFailureResultSets {

	private static int SPELL_LEVEL_BEGIN = 1;
	private static int SPELL_LEVEL_END = 9;
	private static int NO_OF_VALUES_BEGIN = 0;
	private static int NO_OF_VALUES_END = 14;

	@Test
	public void createProbabilityTablesPerD8() {
		for (int noOfD8 = NO_OF_VALUES_BEGIN; noOfD8 <= NO_OF_VALUES_END; noOfD8++) {
			System.out.println("#D8: " + noOfD8);
			createProbabilityHeaderForD8Table(noOfD8);
			for (int spellLevel = SPELL_LEVEL_BEGIN; spellLevel <= SPELL_LEVEL_END; spellLevel++) {
				System.out.printf("|      %d      ", spellLevel);
				createProbabilityEntryForD8Table(spellLevel, noOfD8);
			}
			System.out.println();
		}
	}

	private void createProbabilityHeaderForD8Table(int noOfD8) {
		System.out.printf("| Spell Level ");
		for (int noOfDice = NO_OF_VALUES_BEGIN; noOfDice <= NO_OF_VALUES_END; noOfDice++) {
			System.out.printf("|   %2dD6 %2dD8    ", Math.max(noOfDice - noOfD8, 0), Math.min(noOfD8, noOfDice));
		}
		System.out.print("|\n");
	}

	private void createProbabilityEntryForD8Table(int spellLevel, int noOfD8) {
		for (int noOfDice = NO_OF_VALUES_BEGIN; noOfDice <= NO_OF_VALUES_END; noOfDice++) {
			System.out.printf("| %14.10f ", 100.0 * FailureResultSets.computeSuccessProbability(spellLevel, Math.max(noOfDice - noOfD8, 0), Math.min(noOfD8, noOfDice)));
		}
		System.out.print("|\n");
	}
	

	@Test
	public void createProbabilityTablesPerSpellLevel() {
		for (int spellLevel = SPELL_LEVEL_BEGIN; spellLevel <= SPELL_LEVEL_END; spellLevel++) {
			System.out.println("Spell Level : " + spellLevel);
			createProbabilityHeaderForSpellLevelTable();
			for (int noOfD8 = NO_OF_VALUES_BEGIN; noOfD8 <= NO_OF_VALUES_END; noOfD8++) {
				System.out.printf("| %2dD8 ", noOfD8);
				createProbabilityEntryForSpellLevelTable(spellLevel, noOfD8);
			}
			System.out.println();
		}
	}

	private void createProbabilityHeaderForSpellLevelTable() {
		System.out.printf("| DICE ");
		for (int noOfD6 = NO_OF_VALUES_BEGIN; noOfD6 <= NO_OF_VALUES_END; noOfD6++) {
			System.out.printf("|      %2dD6      ", noOfD6);
		}
		System.out.print("|\n");
	}

	private void createProbabilityEntryForSpellLevelTable(int spellLevel, int noOfD8) {
		for (int noOfD6 = NO_OF_VALUES_BEGIN; noOfD6 + noOfD8 <= NO_OF_VALUES_END; noOfD6++) {
			System.out.printf("| %14.10f ", 100.0 * FailureResultSets.computeSuccessProbability(spellLevel, noOfD6, noOfD8));
		}
		System.out.print("|\n");
	}

}
