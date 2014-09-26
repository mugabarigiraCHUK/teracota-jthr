package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.UserRepository;

@Stateless (name="UserRepository", mappedName="ejb/UserRepository")
public class UserRepositoryBean extends BaseRepositoryBean<User, Long> implements UserRepository {

	public UserRepositoryBean() {
		super(User.class);
	}

	@Override
	public List<User> getUserbyFilter(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}