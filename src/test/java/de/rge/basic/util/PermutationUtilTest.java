package de.rge.basic.util;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class PermutationUtilTest {
	
	private PermutationUtil sut = new PermutationUtil();

	@Test
	public void getNoOfPermutations_value1() {
		int result = sut.getNoOfPermutations(Arrays.asList(1), 0);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value12() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2), 0);
		Assert.assertEquals(2, result);
	}

	@Test
	public void getNoOfPermutations_value11() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1), 0);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value123() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2, 3), 0);
		Assert.assertEquals(6, result);
	}

	@Test
	public void getNoOfPermutations_value112() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 2), 0);
		Assert.assertEquals(3, result);
	}

	@Test
	public void getNoOfPermutations_value122() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2, 2), 0);
		Assert.assertEquals(3, result);
	}

	@Test
	public void getNoOfPermutations_value111() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 1), 0);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value1234() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2, 3, 4), 0);
		Assert.assertEquals(24, result);
	}

	@Test
	public void getNoOfPermutations_value1123() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 2, 3), 0);
		Assert.assertEquals(12, result);
	}

	@Test
	public void getNoOfPermutations_value1223() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2, 2, 3), 0);
		Assert.assertEquals(12, result);
	}

	@Test
	public void getNoOfPermutations_value1233() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 2, 3, 3), 0);
		Assert.assertEquals(12, result);
	}

	@Test
	public void getNoOfPermutations_value1112() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 1, 2), 0);
		Assert.assertEquals(4, result);
	}

	@Test
	public void getNoOfPermutations_value1122() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 2, 2), 0);
		Assert.assertEquals(6, result);
	}

	@Test
	public void getNoOfPermutations_value1111() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 1, 1, 1), 0);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value7_0D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(7), 0);
		Assert.assertEquals(0, result);
	}

	@Test
	public void getNoOfPermutations_value7_1D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(7), 1);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value17_0D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7), 0);
		Assert.assertEquals(0, result);
	}

	@Test
	public void getNoOfPermutations_value17_1D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7), 1);
		Assert.assertEquals(1, result);
	}

	@Test
	public void getNoOfPermutations_value17_2D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7), 2);
		Assert.assertEquals(2, result);
	}

	@Test
	public void getNoOfPermutations_value177_0D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 0);
		Assert.assertEquals(0, result);
	}

	@Test
	public void getNoOfPermutations_value177_1D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 1);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void getNoOfPermutations_value177_2D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 2);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void getNoOfPermutations_value177_3D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 7), 3);
		Assert.assertEquals(3, result);
	}

	@Test
	public void getNoOfPermutations_value178_0D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 0);
		Assert.assertEquals(0, result);
	}

	@Test
	public void getNoOfPermutations_value178_1D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 1);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void getNoOfPermutations_value178_2D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 2);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void getNoOfPermutations_value178_3D8() {
		int result = sut.getNoOfPermutations(Arrays.asList(1, 7, 8), 3);
		Assert.assertEquals(6, result);
	}




}
