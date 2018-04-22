package com.target.retail.model;

public class Product {

	private int id;
	private String name;
	private Currency currentPrice;

	public Product(){}
	public Product(int id, String name, Currency currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
	}
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
	public Currency getCurrency() {
		return currentPrice;
	}
	public void setCurrency(Currency currency) {
		this.currentPrice = currency;
	}

}
