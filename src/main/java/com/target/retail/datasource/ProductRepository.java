package com.target.retail.datasource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.target.retail.model.Currency;
import com.target.retail.model.Product;

@Component
public class ProductRepository {

	private List<Product> products = new ArrayList<>();

	public void setProducts(List<Product> products) {
		
		Product product[] = new Product[]{
				new Product(67718 , "Toy" , new Currency(1181.99, "USD")),
				new Product(67719 , "T-shirt" , new Currency(67719.99, "USD")),
				new Product(67720 , "Ball" , new Currency(29.99, "USD")),
				new Product(67721 , "Shoe" , new Currency(176.99, "USD"))		
		};

		this.products = Arrays.asList(product);
	}

	public List<Product> getProducts(){
		return this.products;
	}
	
	public Product getProduct(int id){
		Product product = null;
		for(Product p : products){
			if(p.getId() == id){
				product = p;
				break;
			}
		}
		return product;
	}

}
