package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.OrderDao;
import com.websystique.spring.model.Order;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao dao;
	
	public void delete(Long id) {
		this.dao.delete(id);
	}

	public void update(Order order) {
		this.dao.update(order);
	}

	public Order save(Order order) {
		return this.dao.save(order);
	}

	public List<Order> findAll() {
		return this.dao.findAll();
	}

	public Order findById(Long id) {
		return this.dao.findById(id);
	}


}
