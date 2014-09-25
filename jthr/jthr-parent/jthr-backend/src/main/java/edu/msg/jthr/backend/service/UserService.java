package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.User;

public interface UserService {
	
	public void addUser(User user);
	public void editUser(User user);
	public void deleteUser(Long id);
	public User getUserById(Long id);
	public List<User> getAllUsers();
	

}
