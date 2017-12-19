package de.rge.basic.util;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class DiceUtilTest {

    private DiceUtil sut = new DiceUtil();

    @Test
    public void rolld6_withinRange() {
        assertThat(sut.rollD6(1000)).containsOnly(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void rolld8_withinRange() {
        assertThat(sut.rollD8(1000)).containsOnly(1, 2, 3, 4, 5, 6, 7, 8);
    }
}
