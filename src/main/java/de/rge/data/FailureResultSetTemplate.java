package de.rge.data;

// import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FailureResultSetTemplate {

	public static final Set<List<Integer>> EXPECTED_FAILURES;
	static {
		Set<List<Integer>> temp = new HashSet<>();
// %INSERT_COMBINATION_ENTRIES_HERE%
		EXPECTED_FAILURES = Collections.unmodifiableSet(temp);
	}

	private FailureResultSetTemplate() {
	}
}
