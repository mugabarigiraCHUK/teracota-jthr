package edu.msg.jthr.backend.service.impl;

import java.util.List;

import javax.ejb.EJB;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.UserDAO;
import edu.msg.jthr.backend.service.UserService;

public class UserServiceImpl implements UserService {
	@EJB
	private UserDAO userDAO;
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
