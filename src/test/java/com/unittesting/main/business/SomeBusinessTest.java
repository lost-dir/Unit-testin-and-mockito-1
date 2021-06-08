package com.unittesting.main.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void calculateSumTest() {
		SomeBusiness someBusiness = new SomeBusiness();
		int actualResult = someBusiness.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	void calculateSumTest_empty() {
		SomeBusiness someBusiness = new SomeBusiness();
		int actualResult = someBusiness.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

}
