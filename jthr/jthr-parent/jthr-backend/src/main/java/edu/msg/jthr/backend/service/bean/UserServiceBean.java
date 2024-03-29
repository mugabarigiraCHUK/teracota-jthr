package edu.msg.jthr.backend.service.bean;

import java.util.Iterator;
import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.RoleRepository;
import edu.msg.jthr.backend.repository.UserRepository;
import edu.msg.jthr.backend.service.UserService;
import edu.msg.jthr.backend.util.PasswordEncrypter;

@Stateless(name = "UserService", mappedName = "ejb/UserService")
@DependsOn({ "UserRepository", "RoleRepository" })
public class UserServiceBean implements UserService {

	@EJB
	private UserRepository repository;
	@EJB
	private RoleRepository roleRepo;

	@Override
	public void addUser(User user) {
//		Leave this here, you know.... just in case :)
//		List<Role> roles = user.getRoles();
//		user.setRoles(new ArrayList<Role>());
//		 
//		for (Role r: roles){
//			user.getRoles().add(roleRepo.getById(r.getId()));
//		}
		user.setPassword(PasswordEncrypter.GenerateHashedPassword(user.getPassword(), ""));
		repository.save(user);
	}

	@Override
	public void editUser(User user) {
		User oldUser = repository.getById(user.getId());
		
		if (!oldUser.getPassword().equals(user.getPassword())){
			user.setPassword(PasswordEncrypter.GenerateHashedPassword(user.getPassword(), ""));
		}

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

		List<User> list = repository.getAll();

		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			User u = it.next();
			if (u.isActive() == false)
				it.remove();
		}

		return list;
	}

	@Override
	public List<User> getUserbyFilter(String pattern) {

		return repository.getUserbyFilter(pattern);
	}

}
