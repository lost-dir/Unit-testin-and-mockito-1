package com.unittesting.main.model;

public class Item {

	private int id;
	private String name;
	private double price;
	private int stock;

	public Item(int id, String name, double price, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}	
}
