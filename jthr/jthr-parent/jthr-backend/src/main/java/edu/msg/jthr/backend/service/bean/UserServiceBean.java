package edu.msg.jthr.backend.service.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Role;
import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.RoleRepository;
import edu.msg.jthr.backend.repository.UserRepository;
import edu.msg.jthr.backend.service.UserService;

@Stateless(name = "UserService", mappedName = "ejb/UserService")
@DependsOn({ "UserRepository", "RoleRepository" })
public class UserServiceBean implements UserService {

	@EJB
	private UserRepository repository;
	@EJB
	private RoleRepository roleRepo;

	@Override
	public void addUser(User user) {
		List<Role> roles = user.getRoles();
		user.setRoles(new ArrayList<Role>());
		 
		for (Role r: roles){
			user.getRoles().add(roleRepo.getById(r.getId()));
		}
		
		repository.save(user);

	}

	@Override
	public void editUser(User user) {
		
		repository.merge(user);
	}

	@Override
	public void deleteUser(User user) {

		user.setActive(false);
		repository.merge(user);
		//repository.delete(user);
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
