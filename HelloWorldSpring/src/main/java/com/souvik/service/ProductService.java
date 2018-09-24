package com.souvik.service;

import java.util.List;

import com.souvik.model.Product;

public interface ProductService {
	public void insertProduct(Product product);
	public Product findProductById(String pId);
	public List<Product> allProducts();
	public void deleteProduct(String pId);
}
