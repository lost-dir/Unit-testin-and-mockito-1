package com.unittesting.main.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.unittesting.main.service.SomeDataService;
/**
 * This annotation is the equivalent to run with mockito junit runner
 * and it is necessary to include two dependencies into the POM.XML f
 * -ile, mockito-core & mockito-junit-jupiter
 * */
@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {
	
	@InjectMocks
	SomeBusiness someBusiness;
	
	@Mock
	SomeDataService someDataService;

	@Test
	void calculateSumService() {
		when(someDataService.retieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, someBusiness.calculateSumService());
	}
	
	@Test
	void calculateSumTest_empty() {
		when(someDataService.retieveAllData()).thenReturn(new int[] {});
		assertEquals(0, someBusiness.calculateSumService());
	}
	
	@Test
	void calculateSumTest_oneValue() {
		when(someDataService.retieveAllData()).thenReturn(new int[] {5});
		assertEquals(5, someBusiness.calculateSumService());
	}
	
}
	