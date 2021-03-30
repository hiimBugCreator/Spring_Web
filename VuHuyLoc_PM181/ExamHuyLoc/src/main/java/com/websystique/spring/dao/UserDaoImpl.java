package com.websystique.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao{

	public User save(User User) {
		persist(User);
		return User;
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public void delete(Long id) {
		Query query = getSession().createSQLQuery("delete from User where Id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}


	public void update(User User) {
		getSession().update(User);
	}

	public User findById(Long id) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id",id));
		return (User) criteria.uniqueResult();
	}
	
	public List<User> findByRole(Long type) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("type",type));
		return (List<User>) criteria.list();
	}
	
	public User findByemail(String name) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.like("email", name));
		return (User) criteria.uniqueResult();
	}
	
	
}
