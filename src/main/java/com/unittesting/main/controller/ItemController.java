package com.unittesting.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unittesting.main.business.ItemServiceImpl;
import com.unittesting.main.model.Item;

@RestController
public class ItemController {
	
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping("/getItem")
	public Item getItem() {
		return new Item(1, "ball", 50.90, 200);
	}
	
	@GetMapping("/getItemService")
	public Item getItemService() {
		return itemService.retieveHarcodedItem();
	}
	
	@GetMapping("/getItems")
	public List<Item> getItems() {
		return itemService.retieveAllItems();	}
}
