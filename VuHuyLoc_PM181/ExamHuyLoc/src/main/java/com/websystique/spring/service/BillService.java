package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.Order;
import com.websystique.spring.model.OrderDetail;

public interface BillService {

	OrderDetail save(OrderDetail employee);
	
	List<OrderDetail> findAll();
	
	void delete(Long id);
	
	void update(OrderDetail order);
	
	OrderDetail findById(Long id);
	
	List<OrderDetail> findId_bill(Long id_bill);
}
