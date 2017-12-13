package de.rge.basic.solver.impl;

import java.util.ArrayList;
import java.util.List;

import de.rge.basic.solver.ArithmancySolver;

public class ArithmancySolverImpl implements ArithmancySolver {

	@Override
	public Integer solve(String spellName) {
		List<Integer> digits = convertToDigits(spellName);
		return computeDigitalRoot(digits);
	}

	private List<Integer> convertToDigits(String spellName) {
		List<Integer> digits = new ArrayList<>();
		for(Character c : spellName.trim().toLowerCase().toCharArray()) {
			digits.add(convertToDigit(c));
		}
		return digits;
	}
	

	private Integer convertToDigit(Character c) {
		if('a' <= c && c <= 'z') {
			return (c - 'a') % 9 + 1;
		}
		if('0' <= c && c <= '9') {
			return c - '0';
		}
		return 0;
	}

	private Integer computeDigitalRoot(List<Integer> digits) {
		Integer sum = 0;
		for(Integer digit : digits) {
			sum += digit;
		}
		if(sum < 10) {
			return sum;
		}
		
		return computeDigitalRoot(extractDigits(sum));
	}
	
	List<Integer> extractDigits(Integer number) {
		List<Integer> digits = new ArrayList<>();
		while(number > 0) {
			digits.add(number % 10);
			number /= 10;
		}
		return digits;
	}

}
