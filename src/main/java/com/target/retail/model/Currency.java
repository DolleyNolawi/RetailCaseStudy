package com.target.retail.model;

public class Currency {

	private double value;
	private String currencyCode;
	
	public Currency(){}
	
	public Currency(double value, String currencyCode) {
		super();
		this.value = value;
		this.currencyCode = currencyCode;
	}

	public double getPrice() {
		return value;
	}
	
	public void setPrice(double price) {
		this.value = price;
	}
	
	public String getCurrency() {
		return currencyCode;
	}
	public void setCurrency(String currency) {
		this.currencyCode = currency;
	}
}
