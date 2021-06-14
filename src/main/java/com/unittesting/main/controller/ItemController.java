package com.unittesting.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unittesting.main.model.Item;

@RestController
public class ItemController {
	
	@GetMapping("/getItem")
	public Item getItem() {
		return new Item(1, "ball", 50.90, 200);
	}
}
