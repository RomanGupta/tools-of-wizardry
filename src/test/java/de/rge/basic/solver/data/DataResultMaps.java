package de.rge.basic.solver.data;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DataResultMaps {
	public static final Boolean SUCCESS = Boolean.TRUE;
	public static final Boolean FAILURE = Boolean.FALSE;
	
	public static Map<Entry<Integer, Integer>, Map<List<Integer>, Boolean>> SPELL_LEVEL_AND_NO_OF_VALUES_TO_EXPECTED_RESULTS;
	static {
		Map<Entry<Integer, Integer>, Map<List<Integer>, Boolean>> temp = new HashMap<>();
		temp.put(new SimpleEntry<>(1, 1), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(1, 2), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(1, 3), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(1, 4), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(1, 5), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(1, 6), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(1, 7), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(1, 8), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(1, 9), DataResultMapsForSpellLevel1.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(2, 1), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(2, 2), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(2, 3), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(2, 4), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(2, 5), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(2, 6), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(2, 7), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(2, 8), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(2, 9), DataResultMapsForSpellLevel2.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(3, 1), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(3, 2), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(3, 3), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(3, 4), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(3, 5), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(3, 6), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(3, 7), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(3, 8), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(3, 9), DataResultMapsForSpellLevel3.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(4, 1), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(4, 2), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(4, 3), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(4, 4), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(4, 5), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(4, 6), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(4, 7), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(4, 8), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(4, 9), DataResultMapsForSpellLevel4.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(5, 1), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(5, 2), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(5, 3), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(5, 4), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(5, 5), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(5, 6), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(5, 7), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(5, 8), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(5, 9), DataResultMapsForSpellLevel5.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(6, 1), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(6, 2), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(6, 3), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(6, 4), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(6, 5), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(6, 6), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(6, 7), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(6, 8), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(6, 9), DataResultMapsForSpellLevel6.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(7, 1), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(7, 2), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(7, 3), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(7, 4), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(7, 5), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(7, 6), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(7, 7), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(7, 8), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(7, 9), DataResultMapsForSpellLevel7.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(8, 1), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(8, 2), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(8, 3), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(8, 4), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(8, 5), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(8, 6), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(8, 7), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(8, 8), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(8, 9), DataResultMapsForSpellLevel8.EXPECTED_RESULTS_09_VALUES);

		temp.put(new SimpleEntry<>(9, 1), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_01_VALUE);
		temp.put(new SimpleEntry<>(9, 2), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_02_VALUES);
		temp.put(new SimpleEntry<>(9, 3), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_03_VALUES);
		temp.put(new SimpleEntry<>(9, 4), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_04_VALUES);
//		temp.put(new SimpleEntry<>(9, 5), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_05_VALUES);
//		temp.put(new SimpleEntry<>(9, 6), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_06_VALUES);
//		temp.put(new SimpleEntry<>(9, 7), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_07_VALUES);
//		temp.put(new SimpleEntry<>(9, 8), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_08_VALUES);
//		temp.put(new SimpleEntry<>(9, 9), DataResultMapsForSpellLevel9.EXPECTED_RESULTS_09_VALUES);
		SPELL_LEVEL_AND_NO_OF_VALUES_TO_EXPECTED_RESULTS = Collections.unmodifiableMap(temp);
	}
	
	private DataResultMaps() {
	}
	
	// TODO: implement Guava Table
}
