package de.rge.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FailureResultSetSpellLevel1Values02 {

	public static final Set<List<Integer>> EXPECTED_FAILURES;
	static {
		Set<List<Integer>> temp = new HashSet<>();
		temp.add(Arrays.asList(1, 1));
		temp.add(Arrays.asList(2, 2));
		temp.add(Arrays.asList(2, 4));
		temp.add(Arrays.asList(2, 8));
		temp.add(Arrays.asList(3, 3));
		temp.add(Arrays.asList(3, 5));
		temp.add(Arrays.asList(3, 7));
		temp.add(Arrays.asList(4, 4));
		temp.add(Arrays.asList(4, 5));
		temp.add(Arrays.asList(4, 6));
		temp.add(Arrays.asList(4, 8));
		temp.add(Arrays.asList(5, 5));
		temp.add(Arrays.asList(5, 6));
		temp.add(Arrays.asList(5, 7));
		temp.add(Arrays.asList(6, 6));
		temp.add(Arrays.asList(6, 7));
		temp.add(Arrays.asList(6, 8));
		temp.add(Arrays.asList(7, 7));
		temp.add(Arrays.asList(7, 8));
		temp.add(Arrays.asList(8, 8));
		EXPECTED_FAILURES = Collections.unmodifiableSet(temp);
	}

	private FailureResultSetSpellLevel1Values02() {
	}
}