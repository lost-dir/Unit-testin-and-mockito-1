package com.unittesting.main.business;

import com.unittesting.main.service.SomeDataService;

public class SomeBusiness {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum = 0;
		for(int value:data) {
			sum += value;
		}
		return sum;
	}
	
	public int calculateSumService() {
		int sum = 0;
		int[] data = someDataService.retieveAllData();
		for(int value:data) {
			sum += value;
		}
		return sum;
	}
}
