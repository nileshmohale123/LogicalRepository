package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.yash.entity.Product;
import com.yash.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {

		return productRepository.save(product);

	}

	public List<Product> saveProducts(List<Product> products) {

		return productRepository.saveAll(products);
	}

	public List<Product> getAllProduct() {

		return productRepository.findAll();
	}

	public Product getProductById(int pid) {

		return productRepository.findById(pid).orElse(null);
	}

	public Product getProductByName(String name) {

		return productRepository.findByName(name);
	}

	public String deleteProduct(int pid) {

		productRepository.deleteById(pid);

		return "delete product " + pid;

	}

	public Product updateProduct(Product product) {

		Product existproduct = productRepository.findById(product.getPid()).orElse(null);
		existproduct.setName(product.getName());
		existproduct.setPrice(product.getPrice());

		return existproduct;

	}
}
