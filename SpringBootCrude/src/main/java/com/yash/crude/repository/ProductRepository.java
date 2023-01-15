package com.yash.crude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.crude.entity.Product;
/**
 * @author nilesh.mohale
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);
	

	
}
