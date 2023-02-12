package com.sportsShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportsShoes.entities.Product;
import com.sportsShoes.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService  productService;
	

	
	@PostMapping("/product/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		product.setStatus("added");
		product.setImgname(" ");
		return productService.addProduct(product);
	}
	
	@GetMapping("/product/getproducts")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	/*
	 * @GetMapping("/products") public List<Product> getAllProducts() { return
	 * productService.getAllProducts(); }
	 * 
	 * @GetMapping("/products/{id}") public Product getProduct(@PathVariable("id")
	 * int id) { return productService.getProduct(id); }
	 * 
	 * @PostMapping("/products") public Product createProduct(@RequestBody Product
	 * product) { return productService.createProduct(product); }
	 * 
	 * @PutMapping("/products/{id}") public Product updateProduct(@RequestBody
	 * Product product , @PathVariable("id") int id) { return
	 * productService.updateProduct(product, id); }
	 * 
	 * @DeleteMapping("/products/{id}") public void
	 * deleteProduct(@PathVariable("id") int id) { productService.deleteProduct(id);
	 * }
	 */
}
