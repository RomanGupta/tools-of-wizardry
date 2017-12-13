package de.rge.basic.util;

import java.util.List;

public class PermutationUtil {
	public final static int RANGE_1_TO_6 = 6;
	public final static int RANGE_1_TO_8 = 8;
	
	public boolean hasNextCombination(List<Integer> values, int range) {
		return values.get(0) < range;
	}

	public void setNextCombination(List<Integer> values, int index, int range) {
		Integer value = values.get(index);
		if (value == range) {
			Integer nextValue = values.get(index - 1);
			if (nextValue < range) {
				for(int ctr = index; ctr < values.size(); ctr++) {
					values.set(ctr, nextValue + 1);
				}
			}
			setNextCombination(values, index - 1, range);
		} else {
			values.set(index, value + 1);
		}
	}

	private class DuplicateHandler {
		private Integer lastValue = Integer.MAX_VALUE;
		private Integer counter = 1;

		public Integer handleDuplicateValues(Integer noOfPermutations, Integer value) {
			if (value < lastValue) {
				counter = 1;
				lastValue = value;
			} else {
				noOfPermutations /= ++counter;
			}
			return noOfPermutations;
		}

	}
	
	// Assumption: values are ordered from low to high values
	public Integer getNoOfPermutations(List<Integer> values, Integer noOfD8) {
		DuplicateHandler duplicateHandler = new DuplicateHandler();
		Integer noOfPermutations = 1;

		for (int ctr = values.size(); ctr > 0 && noOfPermutations > 0; ctr--) {
			Integer value = values.get(ctr - 1);
			noOfPermutations *= value > RANGE_1_TO_6 ? noOfD8-- : ctr;
			noOfPermutations = duplicateHandler.handleDuplicateValues(noOfPermutations, value);
		}

		return duplicateHandler.handleDuplicateValues(noOfPermutations, 0);
	}
}
