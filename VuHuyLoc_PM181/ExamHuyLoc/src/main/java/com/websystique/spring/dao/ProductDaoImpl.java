package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Product;

@Repository("productDao")
public class ProductDaoImpl extends AbstractDao implements ProductDao{

	public Product save(Product product) {
		persist(product);
		return product;
	}

	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		Criteria criteria = getSession().createCriteria(Product.class);
		return (List<Product>) criteria.list();
	}

	public void delete(Long id) {
		Query query = getSession().createSQLQuery("delete from Product where Id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}


	public void update(Product product) {
		getSession().update(product);
	}

	public Product findById(Long id) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("id",id));
		return (Product) criteria.uniqueResult();
	}
	
	public List<Product> findByType(Long type) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("type",type));
		return (List<Product>) criteria.list();
	}
	
	public List<Product> findByName(String name) {
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.like("name", "%"+name+"%"));
		return (List<Product>) criteria.list();
	}
	
	public List<Product> findDis(){
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.gt("discount", 1));
		return (List<Product>) criteria.list();
	};
	
}
