package com.unittesting.main.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.unittesting.main.service.SomeDataService;

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retieveAllData() {
		return new int[] {1, 2, 3};
	}
	
}

class SomeBusinessStubTest {

	@Test
	void calculateSumService() {
		SomeBusiness someBusiness = new SomeBusiness();
		someBusiness.setSomeDataService(new SomeDataServiceStub());
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
	
	@Test
	void calculateSumTest_oneValue() {
		SomeBusiness someBusiness = new SomeBusiness();
		int actualResult = someBusiness.calculateSum(new int[] {5});
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
