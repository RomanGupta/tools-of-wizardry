package de.rge.data;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.rge.basic.util.PermutationUtil;

public class FailureResultSets {

	private static final List<List<Set<List<Integer>>>> FAILURE_SETS = new ArrayList<>();
	static {
		List<Set<List<Integer>>> FailureSetsSpellLevel1 = new ArrayList<>();
		FailureSetsSpellLevel1.add(FailureResultSetSpellLevel1Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel1.add(FailureResultSetSpellLevel1Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel1.add(FailureResultSetSpellLevel1Values03.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel2 = new ArrayList<>();
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel2.add(FailureResultSetSpellLevel2Values07.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel3 = new ArrayList<>();
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel3.add(FailureResultSetSpellLevel3Values08.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel4 = new ArrayList<>();
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel4.add(FailureResultSetSpellLevel4Values10.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel5 = new ArrayList<>();
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values10.EXPECTED_FAILURES);
		FailureSetsSpellLevel5.add(FailureResultSetSpellLevel5Values11.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel6 = new ArrayList<>();
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values10.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values11.EXPECTED_FAILURES);
		FailureSetsSpellLevel6.add(FailureResultSetSpellLevel6Values12.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel7 = new ArrayList<>();
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values10.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values11.EXPECTED_FAILURES);
		FailureSetsSpellLevel7.add(FailureResultSetSpellLevel7Values12.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel8 = new ArrayList<>();
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values10.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values11.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values12.EXPECTED_FAILURES);
		FailureSetsSpellLevel8.add(FailureResultSetSpellLevel8Values13.EXPECTED_FAILURES);

		List<Set<List<Integer>>> FailureSetsSpellLevel9 = new ArrayList<>();
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values01.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values02.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values03.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values04.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values05.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values06.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values07.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values08.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values09.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values10.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values11.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values12.EXPECTED_FAILURES);
		FailureSetsSpellLevel9.add(FailureResultSetSpellLevel9Values13.EXPECTED_FAILURES);

		FAILURE_SETS.add(FailureSetsSpellLevel1);
		FAILURE_SETS.add(FailureSetsSpellLevel2);
		FAILURE_SETS.add(FailureSetsSpellLevel3);
		FAILURE_SETS.add(FailureSetsSpellLevel4);
		FAILURE_SETS.add(FailureSetsSpellLevel5);
		FAILURE_SETS.add(FailureSetsSpellLevel6);
		FAILURE_SETS.add(FailureSetsSpellLevel7);
		FAILURE_SETS.add(FailureSetsSpellLevel8);
		FAILURE_SETS.add(FailureSetsSpellLevel9);
	}

	private static PermutationUtil PermutationUtil = new PermutationUtil();

	private FailureResultSets() {
	}

	public static Boolean isSolvable(Integer spellLevel, List<Integer> values) {
		if (values.contains(0)) {
			List<Integer> valuesCopy = new LinkedList<>();
			valuesCopy.removeAll(Arrays.asList(0));
			return isSolvableForAnySubset(spellLevel, values);
		}
		return is100PercentSolvable(spellLevel, values.size())
				|| !FAILURE_SETS.get(spellLevel - 1).get(values.size() - 1).contains(values);
	}

	private static Boolean isSolvableForAnySubset(Integer spellLevel, List<Integer> values) {
		if (values.size() > 1) {
			for (Integer value : new HashSet<>(values)) {
				List<Integer> valuesCopy = new LinkedList<>(values);
				valuesCopy.remove(value);
				if (isSolvable(spellLevel, valuesCopy) || isSolvableForAnySubset(spellLevel, valuesCopy)) {
					return true;
				}
			}
		}
		return false;
	}

	public static Double computeSuccessProbability(Integer spellLevel, Integer noOfD6, Integer noOfD8) {
		if(spellLevel < 1 || noOfD6 < 0 || noOfD8 < 0) {
			throw new InvalidParameterException("spellLevel " + spellLevel + ", noOfD6 " + noOfD6 + ", noOfD8 " + noOfD8);
		}
		if(noOfD6 + noOfD8 == 0) {
			return 0.0;
		}
		double totalNoOfEvents = Math.pow(6.0, noOfD6) * Math.pow(8.0, noOfD8);
		return (totalNoOfEvents - computeNoOfFailureEvents(spellLevel, noOfD6, noOfD8)) / totalNoOfEvents;
	}

	private static double computeNoOfFailureEvents(Integer spellLevel, Integer noOfD6, Integer noOfD8) {
		double noOfFailureEvents = 0;
		Integer noOfValues = noOfD6 + noOfD8;
		if (!is100PercentSolvable(spellLevel, noOfValues)) {
			for (List<Integer> failureValues : FAILURE_SETS.get(spellLevel - 1).get(noOfValues - 1)) {
				noOfFailureEvents += PermutationUtil.getNoOfPermutations(failureValues, noOfD8);
			}
		}
		return noOfFailureEvents;
	}

	private static Boolean is100PercentSolvable(Integer spellLevel, Integer noOfValues) {
		return FAILURE_SETS.get(spellLevel - 1).size() < noOfValues;
	}
}
