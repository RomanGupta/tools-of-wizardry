package de.rge.basic.solver.data;

import static de.rge.basic.solver.data.DataResultMaps.FAILURE;
import static de.rge.basic.solver.data.DataResultMaps.SUCCESS;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataResultMapsForSpellLevel4 {

	// One dice
	public static final Map<List<Integer>, Boolean> EXPECTED_RESULTS_01_VALUE;
	static {
		Map<List<Integer>, Boolean> temp = new HashMap<>();
		temp.put(Arrays.asList(1), FAILURE);
		temp.put(Arrays.asList(2), FAILURE);
		temp.put(Arrays.asList(3), FAILURE);
		temp.put(Arrays.asList(4), FAILURE);
		temp.put(Arrays.asList(5), FAILURE);
		temp.put(Arrays.asList(6), FAILURE);
		EXPECTED_RESULTS_01_VALUE = Collections.unmodifiableMap(temp);
	}

	// Two dices (with validating permutations)
	public static final Map<List<Integer>, Boolean> EXPECTED_RESULTS_02_VALUES;
	static {
		Map<List<Integer>, Boolean> temp = new HashMap<>();
		temp.put(Arrays.asList(1, 1), FAILURE);
		temp.put(Arrays.asList(1, 2), FAILURE);
		temp.put(Arrays.asList(1, 3), FAILURE);
		temp.put(Arrays.asList(1, 4), FAILURE);
		temp.put(Arrays.asList(1, 5), FAILURE);
		temp.put(Arrays.asList(1, 6), FAILURE);
		temp.put(Arrays.asList(2, 1), FAILURE);
		temp.put(Arrays.asList(2, 2), FAILURE);
		temp.put(Arrays.asList(2, 3), FAILURE);
		temp.put(Arrays.asList(2, 4), FAILURE);
		temp.put(Arrays.asList(2, 5), FAILURE);
		temp.put(Arrays.asList(2, 6), FAILURE);
		temp.put(Arrays.asList(3, 1), FAILURE);
		temp.put(Arrays.asList(3, 2), FAILURE);
		temp.put(Arrays.asList(3, 3), FAILURE);
		temp.put(Arrays.asList(3, 4), FAILURE);
		temp.put(Arrays.asList(3, 5), FAILURE);
		temp.put(Arrays.asList(3, 6), FAILURE);
		temp.put(Arrays.asList(4, 1), FAILURE);
		temp.put(Arrays.asList(4, 2), FAILURE);
		temp.put(Arrays.asList(4, 3), FAILURE);
		temp.put(Arrays.asList(4, 4), FAILURE);
		temp.put(Arrays.asList(4, 5), FAILURE);
		temp.put(Arrays.asList(4, 6), FAILURE);
		temp.put(Arrays.asList(5, 1), FAILURE);
		temp.put(Arrays.asList(5, 2), FAILURE);
		temp.put(Arrays.asList(5, 3), FAILURE);
		temp.put(Arrays.asList(5, 4), FAILURE);
		temp.put(Arrays.asList(5, 5), FAILURE);
		temp.put(Arrays.asList(5, 6), FAILURE);
		temp.put(Arrays.asList(6, 1), FAILURE);
		temp.put(Arrays.asList(6, 2), FAILURE);
		temp.put(Arrays.asList(6, 3), FAILURE);
		temp.put(Arrays.asList(6, 4), FAILURE);
		temp.put(Arrays.asList(6, 5), FAILURE);
		temp.put(Arrays.asList(6, 6), FAILURE);
		EXPECTED_RESULTS_02_VALUES = Collections.unmodifiableMap(temp);
	}

	// Three dices (with validating permutations)
	public static final Map<List<Integer>, Boolean> EXPECTED_RESULTS_03_VALUES;
	static {
		Map<List<Integer>, Boolean> temp = new HashMap<>();
		temp.put(Arrays.asList(1, 1, 1), FAILURE);
		temp.put(Arrays.asList(1, 1, 2), FAILURE);
		temp.put(Arrays.asList(1, 1, 3), FAILURE);
		temp.put(Arrays.asList(1, 1, 4), FAILURE);
		temp.put(Arrays.asList(1, 1, 5), FAILURE);
		temp.put(Arrays.asList(1, 1, 6), FAILURE);
		temp.put(Arrays.asList(1, 2, 1), FAILURE);
		temp.put(Arrays.asList(1, 2, 2), FAILURE);
		temp.put(Arrays.asList(1, 2, 3), FAILURE);
		temp.put(Arrays.asList(1, 2, 4), FAILURE);
		temp.put(Arrays.asList(1, 2, 5), FAILURE);
		temp.put(Arrays.asList(1, 2, 6), FAILURE);
		temp.put(Arrays.asList(1, 3, 1), FAILURE);
		temp.put(Arrays.asList(1, 3, 2), FAILURE);
		temp.put(Arrays.asList(1, 3, 3), FAILURE);
		temp.put(Arrays.asList(1, 3, 4), FAILURE);
		temp.put(Arrays.asList(1, 3, 5), FAILURE);
		temp.put(Arrays.asList(1, 3, 6), FAILURE);
		temp.put(Arrays.asList(1, 4, 1), FAILURE);
		temp.put(Arrays.asList(1, 4, 2), FAILURE);
		temp.put(Arrays.asList(1, 4, 3), FAILURE);
		temp.put(Arrays.asList(1, 4, 4), FAILURE);
		temp.put(Arrays.asList(1, 4, 5), FAILURE);
		temp.put(Arrays.asList(1, 4, 6), FAILURE);
		temp.put(Arrays.asList(1, 5, 1), FAILURE);
		temp.put(Arrays.asList(1, 5, 2), FAILURE);
		temp.put(Arrays.asList(1, 5, 3), FAILURE);
		temp.put(Arrays.asList(1, 5, 4), FAILURE);
		temp.put(Arrays.asList(1, 5, 5), FAILURE);
		temp.put(Arrays.asList(1, 5, 6), SUCCESS); // 1 + 5 * 6 = 31
		temp.put(Arrays.asList(1, 6, 1), FAILURE);
		temp.put(Arrays.asList(1, 6, 2), FAILURE);
		temp.put(Arrays.asList(1, 6, 3), FAILURE);
		temp.put(Arrays.asList(1, 6, 4), FAILURE);
		temp.put(Arrays.asList(1, 6, 5), SUCCESS); // 1 + 6 * 5 = 31
		temp.put(Arrays.asList(1, 6, 6), SUCCESS); // 1 + 6 * 6 = 37
		temp.put(Arrays.asList(2, 1, 1), FAILURE);
		temp.put(Arrays.asList(2, 1, 2), FAILURE);
		temp.put(Arrays.asList(2, 1, 3), FAILURE);
		temp.put(Arrays.asList(2, 1, 4), FAILURE);
		temp.put(Arrays.asList(2, 1, 5), FAILURE);
		temp.put(Arrays.asList(2, 1, 6), FAILURE);
		temp.put(Arrays.asList(2, 2, 1), FAILURE);
		temp.put(Arrays.asList(2, 2, 2), FAILURE);
		temp.put(Arrays.asList(2, 2, 3), FAILURE);
		temp.put(Arrays.asList(2, 2, 4), FAILURE);
		temp.put(Arrays.asList(2, 2, 5), FAILURE);
		temp.put(Arrays.asList(2, 2, 6), FAILURE);
		temp.put(Arrays.asList(2, 3, 1), FAILURE);
		temp.put(Arrays.asList(2, 3, 2), FAILURE);
		temp.put(Arrays.asList(2, 3, 3), FAILURE);
		temp.put(Arrays.asList(2, 3, 4), FAILURE);
		temp.put(Arrays.asList(2, 3, 5), FAILURE);
		temp.put(Arrays.asList(2, 3, 6), FAILURE);
		temp.put(Arrays.asList(2, 4, 1), FAILURE);
		temp.put(Arrays.asList(2, 4, 2), FAILURE);
		temp.put(Arrays.asList(2, 4, 3), FAILURE);
		temp.put(Arrays.asList(2, 4, 4), FAILURE);
		temp.put(Arrays.asList(2, 4, 5), FAILURE);
		temp.put(Arrays.asList(2, 4, 6), FAILURE);
		temp.put(Arrays.asList(2, 5, 1), FAILURE);
		temp.put(Arrays.asList(2, 5, 2), FAILURE);
		temp.put(Arrays.asList(2, 5, 3), FAILURE);
		temp.put(Arrays.asList(2, 5, 4), FAILURE);
		temp.put(Arrays.asList(2, 5, 5), FAILURE);
		temp.put(Arrays.asList(2, 5, 6), FAILURE);
		temp.put(Arrays.asList(2, 6, 1), FAILURE);
		temp.put(Arrays.asList(2, 6, 2), FAILURE);
		temp.put(Arrays.asList(2, 6, 3), FAILURE);
		temp.put(Arrays.asList(2, 6, 4), FAILURE);
		temp.put(Arrays.asList(2, 6, 5), FAILURE);
		temp.put(Arrays.asList(2, 6, 6), FAILURE);
		temp.put(Arrays.asList(3, 1, 1), FAILURE);
		temp.put(Arrays.asList(3, 1, 2), FAILURE);
		temp.put(Arrays.asList(3, 1, 3), FAILURE);
		temp.put(Arrays.asList(3, 1, 4), FAILURE);
		temp.put(Arrays.asList(3, 1, 5), FAILURE);
		temp.put(Arrays.asList(3, 1, 6), FAILURE);
		temp.put(Arrays.asList(3, 2, 1), FAILURE);
		temp.put(Arrays.asList(3, 2, 2), FAILURE);
		temp.put(Arrays.asList(3, 2, 3), FAILURE);
		temp.put(Arrays.asList(3, 2, 4), FAILURE);
		temp.put(Arrays.asList(3, 2, 5), FAILURE);
		temp.put(Arrays.asList(3, 2, 6), FAILURE);
		temp.put(Arrays.asList(3, 3, 1), FAILURE);
		temp.put(Arrays.asList(3, 3, 2), FAILURE);
		temp.put(Arrays.asList(3, 3, 3), FAILURE);
		temp.put(Arrays.asList(3, 3, 4), FAILURE);
		temp.put(Arrays.asList(3, 3, 5), FAILURE);
		temp.put(Arrays.asList(3, 3, 6), FAILURE);
		temp.put(Arrays.asList(3, 4, 1), FAILURE);
		temp.put(Arrays.asList(3, 4, 2), FAILURE);
		temp.put(Arrays.asList(3, 4, 3), FAILURE);
		temp.put(Arrays.asList(3, 4, 4), FAILURE);
		temp.put(Arrays.asList(3, 4, 5), FAILURE);
		temp.put(Arrays.asList(3, 4, 6), FAILURE);
		temp.put(Arrays.asList(3, 5, 1), FAILURE);
		temp.put(Arrays.asList(3, 5, 2), FAILURE);
		temp.put(Arrays.asList(3, 5, 3), FAILURE);
		temp.put(Arrays.asList(3, 5, 4), FAILURE);
		temp.put(Arrays.asList(3, 5, 5), FAILURE);
		temp.put(Arrays.asList(3, 5, 6), FAILURE);
		temp.put(Arrays.asList(3, 6, 1), FAILURE);
		temp.put(Arrays.asList(3, 6, 2), FAILURE);
		temp.put(Arrays.asList(3, 6, 3), FAILURE);
		temp.put(Arrays.asList(3, 6, 4), FAILURE);
		temp.put(Arrays.asList(3, 6, 5), FAILURE);
		temp.put(Arrays.asList(3, 6, 6), FAILURE);
		temp.put(Arrays.asList(4, 1, 1), FAILURE);
		temp.put(Arrays.asList(4, 1, 2), FAILURE);
		temp.put(Arrays.asList(4, 1, 3), FAILURE);
		temp.put(Arrays.asList(4, 1, 4), FAILURE);
		temp.put(Arrays.asList(4, 1, 5), FAILURE);
		temp.put(Arrays.asList(4, 1, 6), FAILURE);
		temp.put(Arrays.asList(4, 2, 1), FAILURE);
		temp.put(Arrays.asList(4, 2, 2), FAILURE);
		temp.put(Arrays.asList(4, 2, 3), FAILURE);
		temp.put(Arrays.asList(4, 2, 4), FAILURE);
		temp.put(Arrays.asList(4, 2, 5), FAILURE);
		temp.put(Arrays.asList(4, 2, 6), FAILURE);
		temp.put(Arrays.asList(4, 3, 1), FAILURE);
		temp.put(Arrays.asList(4, 3, 2), FAILURE);
		temp.put(Arrays.asList(4, 3, 3), FAILURE);
		temp.put(Arrays.asList(4, 3, 4), FAILURE);
		temp.put(Arrays.asList(4, 3, 5), FAILURE);
		temp.put(Arrays.asList(4, 3, 6), FAILURE);
		temp.put(Arrays.asList(4, 4, 1), FAILURE);
		temp.put(Arrays.asList(4, 4, 2), FAILURE);
		temp.put(Arrays.asList(4, 4, 3), FAILURE);
		temp.put(Arrays.asList(4, 4, 4), FAILURE);
		temp.put(Arrays.asList(4, 4, 5), FAILURE);
		temp.put(Arrays.asList(4, 4, 6), FAILURE);
		temp.put(Arrays.asList(4, 5, 1), FAILURE);
		temp.put(Arrays.asList(4, 5, 2), FAILURE);
		temp.put(Arrays.asList(4, 5, 3), FAILURE);
		temp.put(Arrays.asList(4, 5, 4), FAILURE);
		temp.put(Arrays.asList(4, 5, 5), FAILURE);
		temp.put(Arrays.asList(4, 5, 6), FAILURE);
		temp.put(Arrays.asList(4, 6, 1), FAILURE);
		temp.put(Arrays.asList(4, 6, 2), FAILURE);
		temp.put(Arrays.asList(4, 6, 3), FAILURE);
		temp.put(Arrays.asList(4, 6, 4), FAILURE);
		temp.put(Arrays.asList(4, 6, 5), FAILURE);
		temp.put(Arrays.asList(4, 6, 6), FAILURE);
		temp.put(Arrays.asList(5, 1, 1), FAILURE);
		temp.put(Arrays.asList(5, 1, 2), FAILURE);
		temp.put(Arrays.asList(5, 1, 3), FAILURE);
		temp.put(Arrays.asList(5, 1, 4), FAILURE);
		temp.put(Arrays.asList(5, 1, 5), FAILURE);
		temp.put(Arrays.asList(5, 1, 6), SUCCESS); // 5 * 6 + 1 = 31
		temp.put(Arrays.asList(5, 2, 1), FAILURE);
		temp.put(Arrays.asList(5, 2, 2), FAILURE);
		temp.put(Arrays.asList(5, 2, 3), FAILURE);
		temp.put(Arrays.asList(5, 2, 4), FAILURE);
		temp.put(Arrays.asList(5, 2, 5), FAILURE);
		temp.put(Arrays.asList(5, 2, 6), FAILURE);
		temp.put(Arrays.asList(5, 3, 1), FAILURE);
		temp.put(Arrays.asList(5, 3, 2), FAILURE);
		temp.put(Arrays.asList(5, 3, 3), FAILURE);
		temp.put(Arrays.asList(5, 3, 4), FAILURE);
		temp.put(Arrays.asList(5, 3, 5), FAILURE);
		temp.put(Arrays.asList(5, 3, 6), FAILURE);
		temp.put(Arrays.asList(5, 4, 1), FAILURE);
		temp.put(Arrays.asList(5, 4, 2), FAILURE);
		temp.put(Arrays.asList(5, 4, 3), FAILURE);
		temp.put(Arrays.asList(5, 4, 4), FAILURE);
		temp.put(Arrays.asList(5, 4, 5), FAILURE);
		temp.put(Arrays.asList(5, 4, 6), FAILURE);
		temp.put(Arrays.asList(5, 5, 1), FAILURE);
		temp.put(Arrays.asList(5, 5, 2), FAILURE);
		temp.put(Arrays.asList(5, 5, 3), FAILURE);
		temp.put(Arrays.asList(5, 5, 4), FAILURE);
		temp.put(Arrays.asList(5, 5, 5), FAILURE);
		temp.put(Arrays.asList(5, 5, 6), SUCCESS); // 5 * 5 + 6 = 31
		temp.put(Arrays.asList(5, 6, 1), SUCCESS); // 5 * 6 + 1 = 31
		temp.put(Arrays.asList(5, 6, 2), FAILURE);
		temp.put(Arrays.asList(5, 6, 3), FAILURE);
		temp.put(Arrays.asList(5, 6, 4), FAILURE);
		temp.put(Arrays.asList(5, 6, 5), SUCCESS); // 5 * 5 + 6 = 31
		temp.put(Arrays.asList(5, 6, 6), SUCCESS); // 5 + 6 * 6 = 41
		temp.put(Arrays.asList(6, 1, 1), FAILURE);
		temp.put(Arrays.asList(6, 1, 2), FAILURE);
		temp.put(Arrays.asList(6, 1, 3), FAILURE);
		temp.put(Arrays.asList(6, 1, 4), FAILURE);
		temp.put(Arrays.asList(6, 1, 5), SUCCESS); // 6 * 5 + 1 = 31
		temp.put(Arrays.asList(6, 1, 6), SUCCESS); // 6 * 6 + 1 = 37
		temp.put(Arrays.asList(6, 2, 1), FAILURE);
		temp.put(Arrays.asList(6, 2, 2), FAILURE);
		temp.put(Arrays.asList(6, 2, 3), FAILURE);
		temp.put(Arrays.asList(6, 2, 4), FAILURE);
		temp.put(Arrays.asList(6, 2, 5), FAILURE);
		temp.put(Arrays.asList(6, 2, 6), FAILURE);
		temp.put(Arrays.asList(6, 3, 1), FAILURE);
		temp.put(Arrays.asList(6, 3, 2), FAILURE);
		temp.put(Arrays.asList(6, 3, 3), FAILURE);
		temp.put(Arrays.asList(6, 3, 4), FAILURE);
		temp.put(Arrays.asList(6, 3, 5), FAILURE);
		temp.put(Arrays.asList(6, 3, 6), FAILURE);
		temp.put(Arrays.asList(6, 4, 1), FAILURE);
		temp.put(Arrays.asList(6, 4, 2), FAILURE);
		temp.put(Arrays.asList(6, 4, 3), FAILURE);
		temp.put(Arrays.asList(6, 4, 4), FAILURE);
		temp.put(Arrays.asList(6, 4, 5), FAILURE);
		temp.put(Arrays.asList(6, 4, 6), FAILURE);
		temp.put(Arrays.asList(6, 5, 1), SUCCESS); // 6 * 5 + 1= 31
		temp.put(Arrays.asList(6, 5, 2), FAILURE);
		temp.put(Arrays.asList(6, 5, 3), FAILURE);
		temp.put(Arrays.asList(6, 5, 4), FAILURE);
		temp.put(Arrays.asList(6, 5, 5), SUCCESS); // 6 + 5 * 5 = 31
		temp.put(Arrays.asList(6, 5, 6), SUCCESS); // 6 * 6 + 5 = 41
		temp.put(Arrays.asList(6, 6, 1), SUCCESS); // 6 * 6 + 5 = 41
		temp.put(Arrays.asList(6, 6, 2), FAILURE);
		temp.put(Arrays.asList(6, 6, 3), FAILURE);
		temp.put(Arrays.asList(6, 6, 4), FAILURE);
		temp.put(Arrays.asList(6, 6, 5), SUCCESS); // 6 * 6 + 5 = 41
		temp.put(Arrays.asList(6, 6, 6), FAILURE);
		EXPECTED_RESULTS_03_VALUES = Collections.unmodifiableMap(temp);
	}

	// Four dices (WITHOUT validating permutations)
	public static final Map<List<Integer>, Boolean> EXPECTED_RESULTS_04_VALUES;
	static {
		Map<List<Integer>, Boolean> temp = new HashMap<>();
		temp.put(Arrays.asList(1, 1, 1, 1), FAILURE);
		temp.put(Arrays.asList(1, 1, 1, 2), FAILURE);
		temp.put(Arrays.asList(1, 1, 1, 3), FAILURE);
		temp.put(Arrays.asList(1, 1, 1, 4), FAILURE);
		temp.put(Arrays.asList(1, 1, 1, 5), FAILURE);
		temp.put(Arrays.asList(1, 1, 1, 6), FAILURE);
		temp.put(Arrays.asList(1, 1, 2, 2), FAILURE);
		temp.put(Arrays.asList(1, 1, 2, 3), FAILURE);
		temp.put(Arrays.asList(1, 1, 2, 4), FAILURE);
		temp.put(Arrays.asList(1, 1, 2, 5), FAILURE);
		temp.put(Arrays.asList(1, 1, 2, 6), FAILURE);
		temp.put(Arrays.asList(1, 1, 3, 3), FAILURE);
		temp.put(Arrays.asList(1, 1, 3, 4), FAILURE);
		temp.put(Arrays.asList(1, 1, 3, 5), FAILURE);
		temp.put(Arrays.asList(1, 1, 3, 6), FAILURE);
		temp.put(Arrays.asList(1, 1, 4, 4), FAILURE);
		temp.put(Arrays.asList(1, 1, 4, 5), FAILURE);
		temp.put(Arrays.asList(1, 1, 4, 6), SUCCESS); // 1 + (1 + 4) * 5 = 31
		temp.put(Arrays.asList(1, 1, 5, 5), SUCCESS); // 1 + (1 + 5) * 5 = 31
		temp.put(Arrays.asList(1, 1, 5, 6), SUCCESS); // 1 * 1 + 5 * 6 = 31
		temp.put(Arrays.asList(1, 1, 6, 6), SUCCESS); // 1 * 1 + 6 * 6 = 37
		temp.put(Arrays.asList(1, 2, 2, 2), FAILURE);
		temp.put(Arrays.asList(1, 2, 2, 3), FAILURE);
		temp.put(Arrays.asList(1, 2, 2, 4), FAILURE);
		temp.put(Arrays.asList(1, 2, 2, 5), FAILURE);
		temp.put(Arrays.asList(1, 2, 2, 6), FAILURE);
		temp.put(Arrays.asList(1, 2, 3, 3), FAILURE);
		temp.put(Arrays.asList(1, 2, 3, 4), FAILURE);
		temp.put(Arrays.asList(1, 2, 3, 5), SUCCESS); // 1 + 2 * 3 * 5 = 31
		temp.put(Arrays.asList(1, 2, 3, 6), SUCCESS); // 1 + (2 + 3) * 6 = 31
		temp.put(Arrays.asList(1, 2, 4, 4), SUCCESS); // 4 * 2 * 4 - 1 = 31
		temp.put(Arrays.asList(1, 2, 4, 5), SUCCESS); // 1 + 2 * 4 * 5 = 41
		temp.put(Arrays.asList(1, 2, 4, 6), SUCCESS); // 6 * (2 + 4) + 1 = 37
		temp.put(Arrays.asList(1, 2, 5, 5), FAILURE);
		temp.put(Arrays.asList(1, 2, 5, 6), SUCCESS); // 6 * (2 + 5) - 1 = 41
		temp.put(Arrays.asList(1, 2, 6, 6), SUCCESS); // 2 - 1 + 6 * 6 = 37
		temp.put(Arrays.asList(1, 3, 3, 3), FAILURE);
		temp.put(Arrays.asList(1, 3, 3, 4), SUCCESS); // 1 + 3 * 3 * 4 = 37
		temp.put(Arrays.asList(1, 3, 3, 5), SUCCESS); // 1 + (3 + 3) * 5 = 31
		temp.put(Arrays.asList(1, 3, 3, 6), SUCCESS); // 1 + (3 + 3) * 6 = 37
		temp.put(Arrays.asList(1, 3, 4, 4), FAILURE);
		temp.put(Arrays.asList(1, 3, 4, 5), SUCCESS); // 4 * (3 + 5) - 1 = 31
		temp.put(Arrays.asList(1, 3, 4, 6), SUCCESS); // 1 + 3 * (4 + 6) = 31
		temp.put(Arrays.asList(1, 3, 5, 5), SUCCESS); // 1 + 3 * (5 + 5) = 31
		temp.put(Arrays.asList(1, 3, 5, 6), FAILURE);
		temp.put(Arrays.asList(1, 3, 6, 6), SUCCESS); // 1 + 3 * (6 + 6) = 37
		temp.put(Arrays.asList(1, 4, 4, 4), SUCCESS); // 4 * (4 + 4) - 1 = 31
		temp.put(Arrays.asList(1, 4, 4, 5), SUCCESS); // 1 + (4 + 5) * 4 = 37
		temp.put(Arrays.asList(1, 4, 4, 6), SUCCESS); // 1 + (4 + 6) * 4 = 41
		temp.put(Arrays.asList(1, 4, 5, 5), SUCCESS); // 1 + (5 + 5) * 4 = 41
		temp.put(Arrays.asList(1, 4, 5, 6), SUCCESS); // 5 * (1 + 6) - 4 = 31
		temp.put(Arrays.asList(1, 4, 6, 6), SUCCESS); // 1 + 4 + 6 * 6 = 41
		temp.put(Arrays.asList(1, 5, 5, 5), SUCCESS); // 1 + 5 + 5 * 5 = 31
		temp.put(Arrays.asList(1, 5, 5, 6), SUCCESS); // 6 * (1 + 5) + 5 = 41
		temp.put(Arrays.asList(1, 5, 6, 6), SUCCESS); // 1 * 5 + 6 * 6 = 41
		temp.put(Arrays.asList(1, 6, 6, 6), SUCCESS); // 6 - 1 + 6 * 6 = 41
		temp.put(Arrays.asList(2, 2, 2, 2), FAILURE);
		temp.put(Arrays.asList(2, 2, 2, 3), FAILURE);
		temp.put(Arrays.asList(2, 2, 2, 4), FAILURE);
		temp.put(Arrays.asList(2, 2, 2, 5), FAILURE);
		temp.put(Arrays.asList(2, 2, 2, 6), FAILURE);
		temp.put(Arrays.asList(2, 2, 3, 3), FAILURE);
		temp.put(Arrays.asList(2, 2, 3, 4), FAILURE);
		temp.put(Arrays.asList(2, 2, 3, 5), FAILURE);
		temp.put(Arrays.asList(2, 2, 3, 6), FAILURE);
		temp.put(Arrays.asList(2, 2, 4, 4), FAILURE);
		temp.put(Arrays.asList(2, 2, 4, 5), FAILURE);
		temp.put(Arrays.asList(2, 2, 4, 6), FAILURE);
		temp.put(Arrays.asList(2, 2, 5, 5), SUCCESS); // 2 + (2 + 5) * 5 = 37
		temp.put(Arrays.asList(2, 2, 5, 6), SUCCESS); // 2 / 2 + 5 * 6 = 31
		temp.put(Arrays.asList(2, 2, 6, 6), SUCCESS); // 2 / 2 + 6 * 6 = 37
		temp.put(Arrays.asList(2, 3, 3, 3), FAILURE);
		temp.put(Arrays.asList(2, 3, 3, 4), FAILURE);
		temp.put(Arrays.asList(2, 3, 3, 5), FAILURE);
		temp.put(Arrays.asList(2, 3, 3, 6), FAILURE);
		temp.put(Arrays.asList(2, 3, 4, 4), FAILURE);
		temp.put(Arrays.asList(2, 3, 4, 5), SUCCESS); // 2 + (3 + 4) * 5 = 37
		temp.put(Arrays.asList(2, 3, 4, 6), FAILURE);
		temp.put(Arrays.asList(2, 3, 5, 5), SUCCESS); // 2 * 3 + 5 * 5 = 31
		temp.put(Arrays.asList(2, 3, 5, 6), SUCCESS); // 3 - 2 + 5 * 6 = 31
		temp.put(Arrays.asList(2, 3, 6, 6), SUCCESS); // 3 - 2 + 6 * 6 = 37
		temp.put(Arrays.asList(2, 4, 4, 4), FAILURE);
		temp.put(Arrays.asList(2, 4, 4, 5), SUCCESS); // 2 * 4 * 4 + 5 = 37
		temp.put(Arrays.asList(2, 4, 4, 6), FAILURE);
		temp.put(Arrays.asList(2, 4, 5, 5), SUCCESS); // (2 + 5) * 5 - 4 = 31
		temp.put(Arrays.asList(2, 4, 5, 6), SUCCESS); // 2 + 5 + 4 * 6 = 31
		temp.put(Arrays.asList(2, 4, 6, 6), FAILURE);
		temp.put(Arrays.asList(2, 5, 5, 5), FAILURE);
		temp.put(Arrays.asList(2, 5, 5, 6), SUCCESS); // 2 + 5 + 5 * 6 = 37
		temp.put(Arrays.asList(2, 5, 6, 6), FAILURE);
		temp.put(Arrays.asList(2, 6, 6, 6), FAILURE);
		temp.put(Arrays.asList(3, 3, 3, 3), FAILURE);
		temp.put(Arrays.asList(3, 3, 3, 4), SUCCESS); // 3 * 3 * 3 + 4 = 31
		temp.put(Arrays.asList(3, 3, 3, 5), FAILURE);
		temp.put(Arrays.asList(3, 3, 3, 6), FAILURE);
		temp.put(Arrays.asList(3, 3, 4, 4), SUCCESS); // 3 + (3 + 4) * 4 = 31
		temp.put(Arrays.asList(3, 3, 4, 5), SUCCESS); // 3 * 3 * 4 + 5 = 41
		temp.put(Arrays.asList(3, 3, 4, 6), SUCCESS); // 3 * (3 + 6) + 4 = 31
		temp.put(Arrays.asList(3, 3, 5, 5), SUCCESS); // 3 + 3 + 5 * 5 = 31
		temp.put(Arrays.asList(3, 3, 5, 6), SUCCESS); // 3 / 3 + 5 * 6 = 31
		temp.put(Arrays.asList(3, 3, 6, 6), SUCCESS); // 3 / 3 + 6 * 6 = 37
		temp.put(Arrays.asList(3, 4, 4, 4), FAILURE);
		temp.put(Arrays.asList(3, 4, 4, 5), SUCCESS); // (3 + 4) * 5 - 4 = 31
		temp.put(Arrays.asList(3, 4, 4, 6), SUCCESS); // 3 + 4 + 4 * 6 = 31
		temp.put(Arrays.asList(3, 4, 5, 5), SUCCESS); // 4 * (5 + 5) - 3 = 37
		temp.put(Arrays.asList(3, 4, 5, 6), SUCCESS); // 4 * (5 + 6) - 3 = 41
		temp.put(Arrays.asList(3, 4, 6, 6), SUCCESS); // 4 - 3 + 6 * 6 = 37
		temp.put(Arrays.asList(3, 5, 5, 5), FAILURE);
		temp.put(Arrays.asList(3, 5, 5, 6), FAILURE);
		temp.put(Arrays.asList(3, 5, 6, 6), SUCCESS); // 5 + 3 * (6 + 6) = 41
		temp.put(Arrays.asList(3, 6, 6, 6), FAILURE);
		temp.put(Arrays.asList(4, 4, 4, 4), FAILURE);
		temp.put(Arrays.asList(4, 4, 4, 5), SUCCESS); // (4 + 4) * 4 + 5 = 37
		temp.put(Arrays.asList(4, 4, 4, 6), FAILURE);
		temp.put(Arrays.asList(4, 4, 5, 5), SUCCESS); // (4 + 5) * 4 - 5 = 31
		temp.put(Arrays.asList(4, 4, 5, 6), SUCCESS); // 4 / 4 + 5 * 6 = 31
		temp.put(Arrays.asList(4, 4, 6, 6), SUCCESS); // 4 / 4 + 6 * 6 = 37
		temp.put(Arrays.asList(4, 5, 5, 5), FAILURE);
		temp.put(Arrays.asList(4, 5, 5, 6), SUCCESS); // 5 - 4 + 5 * 6 = 31
		temp.put(Arrays.asList(4, 5, 6, 6), SUCCESS); // 5 - 4 + 6 * 6 = 37
		temp.put(Arrays.asList(4, 6, 6, 6), FAILURE);
		temp.put(Arrays.asList(5, 5, 5, 5), FAILURE);
		temp.put(Arrays.asList(5, 5, 5, 6), SUCCESS); // 5 * 6 + 5 / 5 = 31
		temp.put(Arrays.asList(5, 5, 6, 6), SUCCESS); // 5 * 6 + 6 - 5 = 31
		temp.put(Arrays.asList(5, 6, 6, 6), SUCCESS); // 5 * 6 + 6 / 6 = 31
		temp.put(Arrays.asList(6, 6, 6, 6), SUCCESS); // 6 * 6 + 6 / 6 = 37
		EXPECTED_RESULTS_04_VALUES = Collections.unmodifiableMap(temp);
	}

	private DataResultMapsForSpellLevel4() {
	}
}
