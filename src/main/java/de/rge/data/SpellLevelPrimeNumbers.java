package de.rge.data;

// import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellLevelPrimeNumbers {

	public static Map<Integer, List<Integer>> MAP_SPELL_LEVEL_TO_PRIME_NUMBERS;
	static {
		Map<Integer, List<Integer>> temp = new HashMap<>();
		temp.put(1, Arrays.asList(3, 5, 7));
		temp.put(2, Arrays.asList(11, 13, 17));
		temp.put(3, Arrays.asList(19, 23, 29));
		temp.put(4, Arrays.asList(31, 37, 41));
		temp.put(5, Arrays.asList(43, 47, 53));
		temp.put(6, Arrays.asList(59, 61, 67));
		temp.put(7, Arrays.asList(71, 73, 79));
		temp.put(8, Arrays.asList(83, 89, 97));
		temp.put(9, Arrays.asList(101, 103, 107));
		MAP_SPELL_LEVEL_TO_PRIME_NUMBERS = Collections.unmodifiableMap(temp);

	}

	private SpellLevelPrimeNumbers() {
	}
}
