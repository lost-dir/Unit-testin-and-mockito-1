package com.unittesting.main.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.unittesting.main.model.Item;
import com.unittesting.main.repository.ItemRepository;

@ExtendWith(MockitoExtension.class)
class ItemServiceImplTest {
	
	@InjectMocks
	ItemServiceImpl itemService;
	
	@Mock
	ItemRepository itemRepo;

	@Test
	void calculateSumService() {
		when(itemRepo.findAll()).thenReturn(java.util.Arrays.asList(new Item(1, "hat", 20.50, 100), new Item(2, "ball", 68.90, 100)));
		List<Item> items = itemService.retieveAllItems();
		assertEquals(1, items.get(0).getId());
		assertEquals(2, items.get(1).getId());
	}
	
}
	