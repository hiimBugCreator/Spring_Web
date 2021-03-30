package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.Order;
import com.websystique.spring.model.OrderDetail;

public interface BillDao {

	OrderDetail save(OrderDetail employee);
	
	List<OrderDetail> findAll();
	
	void delete(Long id);
	
	void update(OrderDetail order);
	
	OrderDetail findById(Long id);
	
	List<OrderDetail> findId_bill(Long id_bill);
}
