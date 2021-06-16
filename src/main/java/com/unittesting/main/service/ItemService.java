package com.unittesting.main.service;

import java.util.List;

import com.unittesting.main.model.Item;

public interface ItemService {
	
	public Item retieveHarcodedItem();
	
	public List<Item> retieveAllItems();
}
