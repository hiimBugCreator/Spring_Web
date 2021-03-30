package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Order;
import com.websystique.spring.model.OrderDetail;

@Repository("OrderDetailDao")
public class BillDaoImpl extends AbstractDao implements BillDao{

	public OrderDetail save(OrderDetail order) {
		persist(order);
		return order;
	}

	@SuppressWarnings("unchecked")
	public List<OrderDetail> findAll() {
		Criteria criteria = getSession().createCriteria(OrderDetail.class);
		return (List<OrderDetail>) criteria.list();
	}

	public void delete(Long id) {
		Query query = getSession().createSQLQuery("delete from OrderDetail where id_bill = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}
	
	public OrderDetail findById(Long id) {
		Criteria criteria = getSession().createCriteria(OrderDetail.class);
		criteria.add(Restrictions.eq("id",id));
		return (OrderDetail)criteria.uniqueResult();
	}

	public void update(OrderDetail order) {
		getSession().update(order);
	}
	
	public List<OrderDetail> findId_bill(Long id_bill) {
		Criteria criteria = getSession().createCriteria(OrderDetail.class);
		criteria.add(Restrictions.eq("id_bill",id_bill));
		return (List<OrderDetail>) criteria.list();
	}
	
}
