package com.example.demo.model;

public class Items {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Items(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Items() {
		super();
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + "]";
	}
	
	
}
