package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Product;

public interface ProductDao {

	Product save(Product employee);
	
	List<Product> findAll();
	
	void delete(Long id);
	
	void update(Product product);
	
	List<Product> findByType(Long type);
	
	List<Product> findByName(String name);
	
	List<Product> findDis();
	
	Product findById(Long id);
}
