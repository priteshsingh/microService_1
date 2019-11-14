package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Product;

@RestController
@RequestMapping("/product")
public class HomeController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/home")
	public String home() {
		return "THis is product home";
	}

	@Autowired
	Product product;

	@RequestMapping("/{id}")
	public Product getItems(@PathVariable("id") int id) {
		System.out.println("before==============================================================");

		product.setId(id);

		@SuppressWarnings("unchecked")
		List<Object> items = restTemplate.getForObject("http://localhost:8081/item/" + id, List.class);
		System.out.println(items + "------------------------------------------------------------------------");
		product.setDesc(items);

		return product;
	}

}
