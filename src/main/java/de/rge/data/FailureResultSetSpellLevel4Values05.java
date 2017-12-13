package de.rge.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FailureResultSetSpellLevel4Values05 {

	public static final Set<List<Integer>> EXPECTED_FAILURES;
	static {
		Set<List<Integer>> temp = new HashSet<>();
		temp.add(Arrays.asList(1, 1, 1, 1, 1));
		temp.add(Arrays.asList(1, 1, 1, 1, 2));
		temp.add(Arrays.asList(1, 1, 1, 1, 3));
		temp.add(Arrays.asList(1, 1, 1, 1, 4));
		temp.add(Arrays.asList(1, 1, 1, 1, 5));
		temp.add(Arrays.asList(1, 1, 1, 1, 6));
		temp.add(Arrays.asList(1, 1, 1, 1, 7));
		temp.add(Arrays.asList(1, 1, 1, 1, 8));
		temp.add(Arrays.asList(1, 1, 1, 2, 2));
		temp.add(Arrays.asList(1, 1, 1, 2, 3));
		temp.add(Arrays.asList(1, 1, 1, 2, 4));
		temp.add(Arrays.asList(1, 1, 1, 2, 5));
		temp.add(Arrays.asList(1, 1, 1, 2, 6));
		temp.add(Arrays.asList(1, 1, 1, 2, 7));
		temp.add(Arrays.asList(1, 1, 1, 3, 3));
		temp.add(Arrays.asList(1, 1, 1, 3, 4));
		temp.add(Arrays.asList(1, 1, 2, 2, 2));
		temp.add(Arrays.asList(1, 1, 2, 2, 3));
		temp.add(Arrays.asList(1, 1, 2, 2, 4));
		temp.add(Arrays.asList(1, 1, 2, 3, 3));
		temp.add(Arrays.asList(1, 2, 2, 2, 2));
		temp.add(Arrays.asList(1, 2, 2, 2, 3));
		temp.add(Arrays.asList(2, 2, 2, 2, 2));
		temp.add(Arrays.asList(2, 2, 2, 2, 3));
		temp.add(Arrays.asList(2, 2, 2, 2, 4));
		temp.add(Arrays.asList(2, 2, 2, 2, 5));
		temp.add(Arrays.asList(2, 2, 2, 2, 6));
		temp.add(Arrays.asList(2, 2, 2, 2, 7));
		temp.add(Arrays.asList(2, 2, 2, 3, 3));
		temp.add(Arrays.asList(2, 2, 2, 3, 4));
		temp.add(Arrays.asList(2, 3, 3, 3, 3));
		temp.add(Arrays.asList(3, 3, 3, 3, 3));
		temp.add(Arrays.asList(3, 3, 3, 3, 8));
		temp.add(Arrays.asList(8, 8, 8, 8, 8));
		EXPECTED_FAILURES = Collections.unmodifiableSet(temp);
	}

	private FailureResultSetSpellLevel4Values05() {
	}
}