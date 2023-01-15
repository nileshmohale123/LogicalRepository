package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.entity.Product;
import com.yash.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {

		return productService.saveProduct(product);

	}

	@PostMapping("/addProduts")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		return productService.saveProducts(products);
	}

	@GetMapping("/getProduct")
	public List<Product> findAllProduct() {

		return productService.getAllProduct();

	}

	@GetMapping("/getProduct/{id}")
	public Product findProductById(@PathVariable int id) {

		return productService.getProductById(id);
	}

	@GetMapping("/getProduct/{name}")
	public Product findProductByName(@PathVariable String name) {

		return productService.getProductByName(name);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {

		productService.deleteProduct(id);
		return "Product is removed...";
	}

	@PutMapping("/udpate")
	public Product updateProduct(@RequestBody Product product) {

		return productService.updateProduct(product);

	}

}
