package com.yash.crude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.crude.entity.Product;
import com.yash.crude.repository.ProductRepository;
/**
 * @author nilesh.mohale
 *
 */
@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	public Product saveProduct(Product product) {

		return repo.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {

		return repo.saveAll(products);
	}

	public List<Product> getProducts() {

		return repo.findAll();
	}

	public Product getProductById(int id) {

		return repo.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {

		return repo.findByName(name);
	}

	public String deleteProduct(int id) {

		repo.deleteById(id);

		return "Product has been deleted" + id;
	}

	public Product updateProduct(Product product) {

		Product existpro = repo.findById(product.getId()).orElse(null);
		existpro.setName(product.getName());
		existpro.setPrize(product.getPrize());
		existpro.setQuntity(product.getQuntity());
		return existpro;

	}
}
