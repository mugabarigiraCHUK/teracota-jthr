package edu.msg.jthr.backend.repository;

import java.util.List;

import edu.msg.jthr.backend.model.User;

public interface UserDAO {
	
	public void addUser(User user);
	public void editUser(User user);
	public void deleteUser(Long id);
	public List<User> getAllUsers();
	public User getUserById(Long id);
	
}
