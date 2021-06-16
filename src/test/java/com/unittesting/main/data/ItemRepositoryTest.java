package com.unittesting.main.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.unittesting.main.model.Item;
import com.unittesting.main.repository.ItemRepository;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository itemRepo;

	@Test
	void findAllItemsTest() {
		List<Item> items = itemRepo.findAll();
		assertEquals(4, items.size());
	}

}
