package edu.msg.jthr.backend.repository;

import java.util.List;

import edu.msg.jthr.backend.model.User;

public interface UserDAO {
	
	public void add(User user);
	public void edit(User user);
	public void delete(Long id);
	public List<User> getAll();
	public User getById(Long id);
	
}
