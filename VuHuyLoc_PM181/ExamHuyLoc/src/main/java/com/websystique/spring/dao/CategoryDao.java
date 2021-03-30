package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Category;

public interface CategoryDao {

		Category save(Category employee);
		
		List<Category> findAll();
		
		void delete(Long id);
		
		//List<Order> findByAge(Integer age);
		
		void update(Category order);
		
		Category findById(Long id);
}
