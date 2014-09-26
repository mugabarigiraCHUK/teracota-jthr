package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.UserRepository;
import edu.msg.jthr.backend.service.UserService;

@Stateless (name="UserService" , mappedName="ejb/UserService")
@DependsOn ({"UserRepository"})
public class UserServiceBean implements UserService {

	@EJB
	private UserRepository repository;
	
	@Override
	public void addUser(User user) {
		repository.save(user);
		
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return repository.getAll();
	}

	@Override
	public List<User> getUserbyFilter(String pattern) {
		
		return repository.getUserbyFilter(pattern);
	}
	
}
