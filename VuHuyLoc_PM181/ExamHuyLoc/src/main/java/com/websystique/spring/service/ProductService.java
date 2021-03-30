package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Product;

public interface ProductService {

	Product save(Product product);

	List<Product> findAll();

	void delete(Long id);

	void update(Product product);
	
	List<Product> findByType(Long type);
	
	List<Product> findByName(String name);
	
	Product findById(Long id);
	
	List<Product> findDis();
}
