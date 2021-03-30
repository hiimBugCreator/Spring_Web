package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Category;

public interface CategoryService {
	Category save(Category Category);

	List<Category> findAll();

	void delete(Long id);

	void update(Category Category);
	
	Category findById(Long id);
}
