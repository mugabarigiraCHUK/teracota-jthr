package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.User;

public interface UserService {
	
	void add(User user);
	void edit(User user);
	void delete(Long id);
	User getById(Long id);
	List<User> getAll();
	

}
