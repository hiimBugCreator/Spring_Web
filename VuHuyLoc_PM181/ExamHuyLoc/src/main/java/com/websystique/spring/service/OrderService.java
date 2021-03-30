package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Order;

public interface OrderService {

	Order save(Order order);

	List<Order> findAll();

	void delete(Long id);

	void update(Order order);
	
	Order findById(Long id);
	
}
