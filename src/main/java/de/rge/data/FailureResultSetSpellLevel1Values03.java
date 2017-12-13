package de.rge.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FailureResultSetSpellLevel1Values03 {

	public static final Set<List<Integer>> EXPECTED_FAILURES;
	static {
		Set<List<Integer>> temp = new HashSet<>();
		temp.add(Arrays.asList(1, 4, 5));
		temp.add(Arrays.asList(1, 5, 5));
		temp.add(Arrays.asList(1, 5, 6));
		temp.add(Arrays.asList(1, 6, 6));
		temp.add(Arrays.asList(1, 6, 7));
		temp.add(Arrays.asList(1, 7, 7));
		temp.add(Arrays.asList(1, 7, 8));
		temp.add(Arrays.asList(1, 8, 8));
		temp.add(Arrays.asList(2, 4, 8));
		EXPECTED_FAILURES = Collections.unmodifiableSet(temp);
	}

	private FailureResultSetSpellLevel1Values03() {
	}
}