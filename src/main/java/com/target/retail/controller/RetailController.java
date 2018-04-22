package com.target.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.target.retail.datasource.ProductRepository;
import com.target.retail.exception.InvalidInputException;
import com.target.retail.model.Currency;
import com.target.retail.model.Product;

@RestController
public class RetailController {
	
	@Autowired
	private ProductRepository productRepo;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
    @ResponseBody
	public Product getProductPrice(@RequestParam("id") int id) throws InvalidInputException{
		
		Product product = null;
		if(id < 0) {
			throw new InvalidInputException("Invalid Input", id + " is not a valid input");
		}else{
			product = productRepo.getProduct( id );
			if ((product == null) || (product.getId() == 0)){
	            throw new InvalidInputException("The 'productId' Not found", "Null");
			}
		}
		return product;
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.PUT)
    @ResponseBody
	private Product updateProductPrice(@RequestParam("id") int id) throws InvalidInputException{
		
		Product product = null;
		if(id < 0 ) {
			throw new InvalidInputException("Invalid Input", id + " is not a valid input");
		}else{
			product = productRepo.getProduct(id);
			product.setName("Tv");
			product.setCurrency(new Currency(34, "USD"));
			
		}
		return product;
	}
	
}
