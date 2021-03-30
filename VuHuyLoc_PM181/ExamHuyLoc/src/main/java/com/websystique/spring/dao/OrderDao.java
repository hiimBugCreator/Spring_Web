package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Order;

public interface OrderDao {

	Order save(Order order);
	
	List<Order> findAll();
	
	void delete(Long id);
	
	void update(Order order);
	
	Order findById(Long id);
	
	
}
