package com.websystique.spring.service;

import java.util.List;

import com.websystique.spring.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	void delete(Long id);

	void update(User user);
	
	List<User> findByRole(Long role);
	
	User findByemail(String username);
	
	User findById(Long id);
	
}
