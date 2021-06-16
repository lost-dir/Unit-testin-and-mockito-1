package com.unittesting.main.business;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unittesting.main.model.Item;
import com.unittesting.main.repository.ItemRepository;
import com.unittesting.main.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public Item retieveHarcodedItem() {
		return new Item(1, "ball", 50.90, 200);
	}

	@Override
	public List<Item> retieveAllItems() {
		List<Item> myList = itemRepo.findAll();		
		return myList;
	}

}
