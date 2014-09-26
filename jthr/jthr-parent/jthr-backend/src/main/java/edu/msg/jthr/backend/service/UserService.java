package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.User;

@Local
public interface UserService {

	void addUser(User user);

	void editUser(User user);

	void deleteUser(Long id);

	User getUserById(Long id);

	List<User> getAllUsers();

	List<User> getUserbyFilter(String pattern);

}
