package com.souvik.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.model.Product;
import com.souvik.repository.ProductRepository;
import com.souvik.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository pRepo;
	public void insertProduct(Product product) {
		
		pRepo.save(product);
		
	}

	public Product findProductById(String pId) {
		return pRepo.findById(pId).get();
	}

	public List<Product> allProducts() {
		/* Iterable<Product> itr=pRepo.findAll();
		 List<Product> pList = new ArrayList<>();
		 for(Product p: itr) {
			 pList.add(p);
		 }*/
		return pRepo.findAllProduct();
	}

	@Override
	public void deleteProduct(String pId) {
		pRepo.deleteById(pId);
		
	}
	
}
