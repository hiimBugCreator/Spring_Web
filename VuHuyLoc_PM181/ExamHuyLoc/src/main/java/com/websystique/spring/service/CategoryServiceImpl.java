package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.CategoryDao;
import com.websystique.spring.dao.OrderDao;
import com.websystique.spring.model.Category;
import com.websystique.spring.model.Order;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao dao;
	
	public void delete(Long id) {
		this.dao.delete(id);
	}

	public void update(Category order) {
		this.dao.update(order);
	}

	public Category save(Category order) {
		return this.dao.save(order);
	}

	public List<Category> findAll() {
		return this.dao.findAll();
	}

	public Category findById(Long id) {
		return this.dao.findById(id);
	}

}
