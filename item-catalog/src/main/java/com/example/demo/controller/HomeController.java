package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Items;

@RestController
@RequestMapping("/item")
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "Hello Home";
	}
	
	@RequestMapping("/{id}")
	public List<Items> itemList(){
		return Arrays.asList(
				new Items(1,"gaurav"),
				new Items(2,"prietsh")
				);
	}
}
