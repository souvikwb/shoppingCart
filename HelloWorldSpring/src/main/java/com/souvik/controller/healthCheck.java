package com.souvik.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.dao.ProductDao;
import com.souvik.model.Product;
import com.souvik.service.ProductService;

@Controller
public class healthCheck {
	//private ProductDao productDao = new ProductDao();
	@Autowired
	ProductService pService;
	
	@RequestMapping(value="/home")
	public String healthCheck() {
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/insertProduct", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createUser(@RequestBody Product product) {
		pService.insertProduct(product);
		return new ResponseEntity<>("Successfully inserted the data",HttpStatus.OK);
	}
	
	@RequestMapping(value="/productList")
	public String getProducts(Model model) {
		//List<Product> productList = productDao.getProductList();
		List<Product> productList = pService.allProducts();
		//List product = productList.get(0);
		//System.out.println(product.getProductName());
		model.addAttribute("products",productList);
		return "productList";
	}
	
	@RequestMapping(value="/{productId}")
	public String viewProducts(@PathVariable String productId, Model model)throws IOException {
		//List<Product> productList = productDao.getProductList();
		//List product = productList.get(0);
		//System.out.println(product.getProductName());
		//Product product = productDao.getProductById(productId);
		Product product = pService.findProductById(productId);
		model.addAttribute("product",product);
		return "viewProduct";
	}
	
	@RequestMapping(value="/admin")
	public String adminPage() {
		return "admin";
	}
	
	@RequestMapping(value="/productInventory")
	public String productInventory(Model model) {
		List<Product> pList = pService.allProducts();
		model.addAttribute("products", pList);
		return "productInventory";
	}
	
	@RequestMapping(value="/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
		/*product.setProductCategory("instrument");
		product.setProductCondition("new");
		product.setProductStatus("active");*/
		
		model.addAttribute("product", product);
		return "addProduct";
	}
	
	@RequestMapping(value="/addProduct", method= RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product) {
		//product.setProductId("p105");
		pService.insertProduct(product);
		return "productInventory";
	}
	
	@RequestMapping(value="/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable String productId, Model model)throws IOException {
		pService.deleteProduct(productId);
		return "redirect:/productInventory";
	}
}
