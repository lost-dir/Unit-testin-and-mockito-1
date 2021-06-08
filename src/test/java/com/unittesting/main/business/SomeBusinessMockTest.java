package com.unittesting.main.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.unittesting.main.service.SomeDataService;

//Instead of the stubbing class there is no class in here

class SomeBusinessMockTest {
	
	SomeBusiness someBusiness = new SomeBusiness();
	//1.-
	/*
	 * At first we create an object of SomeDataService which is assigned to a mock object and we define the class we will mock inside this mock object
	 * */
	SomeDataService someDataService = mock(SomeDataService.class);

	@Test
	void calculateSumService() {
		//2.-
		/*
		 * Now we use the method when that means, when we call this mock object, the return, and we can manipulate the returning data
		 * */
		when(someDataService.retieveAllData()).thenReturn(new int[] {1,2,3});
		//3.-
		/*
		 * At last we assign the retrieved data to the dependency in the Some business dot java class
		 * */
		someBusiness.setSomeDataService(someDataService);
		int actualResult = someBusiness.calculateSumService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSumTest_empty() {
		when(someDataService.retieveAllData()).thenReturn(new int[] {});
		someBusiness.setSomeDataService(someDataService);
		
		int actualResult = someBusiness.calculateSumService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void calculateSumTest_oneValue() {
		
		when(someDataService.retieveAllData()).thenReturn(new int[] {5});
		someBusiness.setSomeDataService(someDataService);
		
		int actualResult = someBusiness.calculateSumService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
