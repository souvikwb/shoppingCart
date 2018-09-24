package com.souvik.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.souvik.model.Product;

public class ProductDao {
	private List<Product> productList;
	
	public List<Product> getProductList(){
		Product product1 = new Product();
		
		product1.setProductId("p101");
		product1.setProductCategory("instrument");
		product1.setProductCondition("New");
		product1.setProductDescription("This is a basic guitar");
		product1.setProductManufacture("Gibson");
		product1.setProductName("Guitar");
		product1.setProductPrice(4000);
		product1.setProductStatus("Active");
		
		Product product2 = new Product();
		
		product2.setProductId("p102");
		product2.setProductCategory("instrument");
		product2.setProductCondition("New");
		product2.setProductDescription("This is a advanced Harmonica");
		product2.setProductManufacture("Hoffner");
		product2.setProductName("Harmonica");
		product2.setProductPrice(8000);
		product2.setProductStatus("Active");
		
		Product product3 = new Product();
		
		product3.setProductId("p103");
		product3.setProductCategory("instrument");
		product3.setProductCondition("New");
		product3.setProductDescription("This is a basic Flute");
		product3.setProductManufacture("Bansuri");
		product3.setProductName("Flute");
		product3.setProductPrice(10000);
		product3.setProductStatus("Active");	
		
		productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}

	public Product getProductById(String productId) throws IOException{
		// TODO Auto-generated method stub
		for(Product p: getProductList()) {
			if(p.getProductId().equals(productId))
				return p;
		}
		throw new IOException("Product Not Found");
	}
}
