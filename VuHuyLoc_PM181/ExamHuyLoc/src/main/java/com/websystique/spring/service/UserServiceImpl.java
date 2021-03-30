package com.websystique.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.spring.dao.UserDao;
import com.websystique.spring.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	public void delete(Long id) {
		this.dao.delete(id);
	}
	
	public void update(User product) {
		this.dao.update(product);
	}

	public User save(User product) {
		return this.dao.save(product);
	}

	public List<User> findAll() {
		return this.dao.findAll();
	}

	public User findById(Long id) {
		return this.dao.findById(id);
	}

	public List<User> findByRole(Long type) {
		return this.dao.findByRole(type);
	}
	
	public User findByemail(String name) {
		return this.dao.findByemail(name);
	}
}
