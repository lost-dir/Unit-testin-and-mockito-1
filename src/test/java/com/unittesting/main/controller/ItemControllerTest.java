package com.unittesting.main.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.unittesting.main.business.ItemServiceImpl;
import com.unittesting.main.model.Item;

@WebMvcTest(ItemController.class)
@RunWith(SpringRunner.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemServiceImpl itemService;
	
	private RequestBuilder request;
	
	private MvcResult response;
	
	@Test
	public void ItemBasic() throws Exception {
		request = MockMvcRequestBuilders.get("/getItem").accept(MediaType.APPLICATION_JSON);
		response = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"ball\",\"price\":50.9,\"stock\":200}"))
				.andReturn();

	}
	
	@Test
	public void ItemServiceBasic() throws Exception {
		when(itemService.retieveHarcodedItem()).thenReturn(new Item(1, "ball", 50.90, 200));
		request = MockMvcRequestBuilders.get("/getItemService").accept(MediaType.APPLICATION_JSON);
		response = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"ball\",\"price\":50.9,\"stock\":200}"))
				.andReturn();

	}
}
