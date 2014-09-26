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
		repository.merge(user);
	}

	@Override
	public void deleteUser(User user) {
		
			repository.delete(user);
	}

	@Override
	public User getUserById(Long id) {
		return repository.getById(id);
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
