package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Category;
import com.websystique.spring.model.Order;

@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao implements CategoryDao{

	public Category save(Category employee) {
		persist(employee);
		return employee;
	}
	
	@SuppressWarnings("unchecked")
	public List<Category> findAll() {
		Criteria criteria = getSession().createCriteria(Category.class);
		return (List<Category>) criteria.list();
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Category order) {
		// TODO Auto-generated method stub
		
	}

	public Category findById(Long id) {
		Criteria criteria = getSession().createCriteria(Category.class);
		criteria.add(Restrictions.eq("id",id));
		return (Category)criteria.uniqueResult();
	}
	
}
