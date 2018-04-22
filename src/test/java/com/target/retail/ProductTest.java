package com.target.retail;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.target.retail.controller.RetailController;
import com.target.retail.datasource.ProductRepository;
import com.target.retail.model.Currency;
import com.target.retail.model.Product;


@RunWith(SpringRunner.class)
@WebMvcTest(value = RetailController.class)
public class ProductTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RetailController productCtr;
	
	public static int id = 67718;
	
	@Test
	public void getProductDetailsTest() throws Exception{
		
		Currency currency = new Currency();
		currency.setCurrency("USD");
		currency.setPrice(1687.99);
		
		Product product = new Product();
		product.setName("PC");
		product.setId(67718);
		product.setCurrency(currency);

		Mockito.when(productCtr.getProductPrice(id)).thenReturn(product);

		assertEquals("PC", productCtr.getProductPrice(id).getName());

	}
}
