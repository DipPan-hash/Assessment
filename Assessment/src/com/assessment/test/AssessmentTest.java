package com.assessment.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.assessment.main.Assessment;

public class AssessmentTest { //////////////////////////////////////////////////////////////SECOND PART///////////////////////////////////////////////////////////
	@Test
	public void testMultiplyFractionsCase1() throws InterruptedException {
		int[] expectedResult = { 1, 6 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(1, 2, 1, 3));
	}

	@Test
	public void testMultiplyFractionsCase2() throws InterruptedException {
		int[] expectedResult = { 6, 25 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(6, 10, 4, 10));
	}

	@Test
	public void testMultiplyFractionsCase3() throws InterruptedException {
		int[] expectedResult = { 12, 25 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(6, 5, 4, 10));
	}

	@Test
	public void testMultiplyFractionsCase4() throws InterruptedException {
		int[] expectedResult = { 0, 1 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(0, 3, 4, 6));
	}

	@Test
	public void testMultiplyFractionsCase5() throws InterruptedException {
		int[] expectedResult = { 1, 0 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(1, 4, 9, 0));
	}

	@Test
	public void testMultiplyFractionsCase6() throws InterruptedException {
		int[] expectedResult = { -7, 1 };
		assertArrayEquals(expectedResult, new Assessment().multiplyFractions(8, -2, 7, 4));
	}

	@Test
	public void testGCDCase1() {
		int expectedResult = 1;
		assertEquals(expectedResult, new Assessment().reduce(1, 6));
	}

	@Test
	public void testGCDCase2() {
		int expectedResult = 4;
		assertEquals(expectedResult, new Assessment().reduce(24, 100));
	}

	@Test
	public void testGCDCase3() {
		int expectedResult = 2;
		assertEquals(expectedResult, new Assessment().reduce(24, 50));
	}

	@Test
	public void testGCDCase4() {
		int expectedResult = 18;
		assertEquals(expectedResult, new Assessment().reduce(0, 18));
	}

	@Test
	public void testGCDCase5() {
		int expectedResult = 9;
		assertEquals(expectedResult, new Assessment().reduce(9, 0));
	}

	@Test
	public void testGCDCase6() {
		int expectedResult = -8;
		assertEquals(expectedResult, new Assessment().reduce(56, -8));
	}
}      ///////////////////////////////////////////////////////////////////////////SECOND PART////////////////////////////////////////////////////////////////////
