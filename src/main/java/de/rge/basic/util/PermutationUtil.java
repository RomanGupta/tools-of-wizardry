package de.rge.basic.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationUtil {
	public final static int RANGE_1_TO_6 = 6;
	public final static int RANGE_1_TO_8 = 8;

	private List<Integer> values;
	private int valueRange;

	public PermutationUtil() {
		this(1, RANGE_1_TO_6);
	}

	public PermutationUtil(int noOfValues, int valueRange) {
		this.values = initializeValues(noOfValues);
		this.valueRange = valueRange;
	}

	private List<Integer> initializeValues(int noOfValues) {
		List<Integer> values = new ArrayList<>(Collections.nCopies(noOfValues - 1, 1));
		values.add(0);
		return values;
	}

	public boolean hasNextCombination() {
		return values.get(0) < valueRange;
	}

	public List<Integer> getNextCombination() {
		setNextCombination(values.size() - 1);
		return Collections.unmodifiableList(values);
	}

	private void setNextCombination(int index) {
		Integer value = values.get(index);
		if (value == valueRange) {
			handleOverflow(index);
			setNextCombination(index - 1);
		} else {
			values.set(index, value + 1);
		}
	}

	private void handleOverflow(int index) {
		Integer nextValue = values.get(index - 1);
		if (nextValue < valueRange) {
            for(int ctr = index; ctr < values.size(); ctr++) {
                values.set(ctr, nextValue + 1);
            }
        }
	}

	private class DuplicateHandler {
		private Integer lastValue = Integer.MAX_VALUE;
		private Integer counter = 1;

		Integer handleDuplicateValues(Integer noOfPermutations, Integer value) {
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
