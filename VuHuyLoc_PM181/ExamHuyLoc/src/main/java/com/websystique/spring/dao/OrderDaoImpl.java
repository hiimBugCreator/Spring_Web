package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Order;

@Repository("orderDao")
public class OrderDaoImpl extends AbstractDao implements OrderDao{

	public Order save(Order order) {
		persist(order);
		return order;
	}

	@SuppressWarnings("unchecked")
	public List<Order> findAll() {
		Criteria criteria = getSession().createCriteria(Order.class);
		return (List<Order>) criteria.list();
	}

	public void delete(Long id) {
		Query query = getSession().createSQLQuery("delete from Order where Id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}
	
	public Order findById(Long id) {
		Criteria criteria = getSession().createCriteria(Order.class);
		criteria.add(Restrictions.eq("id",id));
		return (Order)criteria.uniqueResult();
	}

	public void update(Order order) {
		getSession().update(order);
	}

	
	
	
	
}
