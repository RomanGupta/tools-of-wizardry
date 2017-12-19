package de.rge.basic.solver.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.rge.basic.solver.ArithmancySolver;

public class ArithmancySolverImpl implements ArithmancySolver {

    @Override
    public Integer solve(String spellName) {
        List<Integer> digits = convertToDigits(spellName.trim().toLowerCase());
        return computeDigitalRoot(digits);
    }

    private List<Integer> convertToDigits(String spellName) {
        return spellName.chars()
                .map(this::convertToDigit)
                .boxed()
                .collect(Collectors.toList());
    }


    private int convertToDigit(int c) {
        if ('a' <= c && c <= 'z') {
            return (c - 'a') % 9 + 1;
        }
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        return 0;
    }

    private int computeDigitalRoot(List<Integer> digits) {
        int sum = digits.stream()
                .mapToInt(Integer::intValue)
                .sum();
        if (sum < 10) {
            return sum;
        }

        return computeDigitalRoot(extractDigits(sum));
    }

    List<Integer> extractDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

}
