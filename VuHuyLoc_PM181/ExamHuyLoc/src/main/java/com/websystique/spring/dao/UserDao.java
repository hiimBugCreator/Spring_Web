package com.websystique.spring.dao;

import java.util.List;

import com.websystique.spring.model.User;

public interface UserDao {

	User save(User employee);
	
	List<User> findAll();
	
	void delete(Long id);
	
	void update(User User);
	
	List<User> findByRole(Long type);
	
	User findByemail(String name);
	
	User findById(Long id);
}
