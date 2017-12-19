package de.rge.basic.util;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static de.rge.basic.util.PermutationUtil.RANGE_1_TO_6;
import static de.rge.basic.util.PermutationUtil.RANGE_1_TO_8;
import static org.assertj.core.api.Assertions.assertThat;

public class PermutationUtilTest {

    private PermutationUtil sut;

    @Before
    public void setupSut() {
        sut = new PermutationUtil();
    }

    @Test
    public void getNextCombination_oneValueD6Range() {
        executeGetNextCombinationWithOneValue(RANGE_1_TO_6);
    }

    @Test
    public void getNextCombination_oneValueD8Range() {
        executeGetNextCombinationWithOneValue(RANGE_1_TO_8);
    }

    private void executeGetNextCombinationWithOneValue(int valueRange) {
        sut = new PermutationUtil(1, valueRange);
        for (int ctr = 1; ctr <= valueRange; ctr++) {
            assertThat(sut.hasNextCombination()).isTrue();
            assertThat(sut.getNextCombination()).containsExactly(ctr);
        }
        assertThat(sut.hasNextCombination()).isFalse();
    }

    @Test
    public void getNextCombination_twoValuesD6Range() {
        executeGetNextCombinationWithTwoValues(RANGE_1_TO_6);
    }

    @Test
    public void getNextCombination_twoValuesD8Range() {
        executeGetNextCombinationWithTwoValues(RANGE_1_TO_8);
    }

    private void executeGetNextCombinationWithTwoValues(int valueRange) {
        sut = new PermutationUtil(2, valueRange);
        for (int ctr1 = 1; ctr1 <= valueRange; ctr1++) {
            for (int ctr2 = ctr1; ctr2 <= valueRange; ctr2++) {
                assertThat(sut.hasNextCombination()).isTrue();
                assertThat(sut.getNextCombination()).containsExactly(ctr1, ctr2);
            }
        }
        assertThat(sut.hasNextCombination()).isFalse();
    }

    @Test
    public void getNoOfPermutations_value1() {
        assertThat(sut.getNoOfPermutations(Collections.singletonList(1), 0)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value12() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2), 0)).isEqualTo(2);
    }

    @Test
    public void getNoOfPermutations_value11() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1), 0)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value123() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2, 3), 0)).isEqualTo(6);
    }

    @Test
    public void getNoOfPermutations_value112() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 2), 0)).isEqualTo(3);
    }

    @Test
    public void getNoOfPermutations_value122() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2, 2), 0)).isEqualTo(3);
    }

    @Test
    public void getNoOfPermutations_value111() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 1), 0)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value1234() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2, 3, 4), 0)).isEqualTo(24);
    }

    @Test
    public void getNoOfPermutations_value1123() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 2, 3), 0)).isEqualTo(12);
    }

    @Test
    public void getNoOfPermutations_value1223() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2, 2, 3), 0)).isEqualTo(12);
    }

    @Test
    public void getNoOfPermutations_value1233() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 2, 3, 3), 0)).isEqualTo(12);
    }

    @Test
    public void getNoOfPermutations_value1112() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 1, 2), 0)).isEqualTo(4);
    }

    @Test
    public void getNoOfPermutations_value1122() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 2, 2), 0)).isEqualTo(6);
    }

    @Test
    public void getNoOfPermutations_value1111() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 1, 1, 1), 0)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value7_0D8() {
        assertThat(sut.getNoOfPermutations(Collections.singletonList(7), 0)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value7_1D8() {
        assertThat(sut.getNoOfPermutations(Collections.singletonList(7), 1)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value17_0D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7), 0)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value17_1D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7), 1)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value17_2D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7), 2)).isEqualTo(2);
    }

    @Test
    public void getNoOfPermutations_value177_0D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 0)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value177_1D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 1)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value177_2D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 2)).isEqualTo(1);
    }

    @Test
    public void getNoOfPermutations_value177_3D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 3)).isEqualTo(3);
    }

    @Test
    public void getNoOfPermutations_value178_0D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 0)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value178_1D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 1)).isEqualTo(0);
    }

    @Test
    public void getNoOfPermutations_value178_2D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 2)).isEqualTo(2);
    }

    @Test
    public void getNoOfPermutations_value178_3D8() {
        assertThat(sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 3)).isEqualTo(6);
    }


}
