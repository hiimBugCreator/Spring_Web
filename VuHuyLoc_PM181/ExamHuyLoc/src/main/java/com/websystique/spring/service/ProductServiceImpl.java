package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.ProductDao;
import com.websystique.spring.model.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	public void delete(Long id) {
		this.dao.delete(id);
	}
	
	public void update(Product product) {
		this.dao.update(product);
	}

	public Product save(Product product) {
		return this.dao.save(product);
	}

	public List<Product> findAll() {
		return this.dao.findAll();
	}

	public Product findById(Long id) {
		return this.dao.findById(id);
	}

	public List<Product> findByType(Long type) {
		return this.dao.findByType(type);
	}
	
	public List<Product> findByName(String name) {
		return this.dao.findByName(name);
	}

	public List<Product> findDis() {
		return this.dao.findDis();
	}
}
