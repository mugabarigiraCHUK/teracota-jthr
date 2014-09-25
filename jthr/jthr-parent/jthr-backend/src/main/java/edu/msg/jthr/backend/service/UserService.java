package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.User;

public interface UserService {
	
	public void add(User user);
	public void edit(User user);
	public void delete(Long id);
	public User getById(Long id);
	public List<User> getAll();
	

}
