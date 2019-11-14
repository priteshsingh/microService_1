package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Product {
	
	private int id;
	private List<Object> desc;
}
