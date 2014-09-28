package edu.msg.jthr.backend.service;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.User;

@Local
public interface LoginService {
	User loginUser(String username, String password);
}
