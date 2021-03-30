package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.BillDao;
import com.websystique.spring.dao.OrderDao;
import com.websystique.spring.model.Order;
import com.websystique.spring.model.OrderDetail;

@Service("billService")
@Transactional
public class BillServiceImpl implements BillService{

	@Autowired
	private BillDao dao;
	
	public void delete(Long id) {
		this.dao.delete(id);
	}

	public void update(OrderDetail order) {
		this.dao.update(order);
	}

	public OrderDetail save(OrderDetail order) {
		return this.dao.save(order);
	}

	public List<OrderDetail> findAll() {
		return this.dao.findAll();
	}

	public OrderDetail findById(Long id) {
		return this.dao.findById(id);
	}

	public List<OrderDetail> findId_bill(Long id_bill) {
		return this.dao.findId_bill(id_bill);
	}
}
