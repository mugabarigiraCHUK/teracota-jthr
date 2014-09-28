package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.UserRepository;
import edu.msg.jthr.backend.service.LoginService;
import edu.msg.jthr.backend.util.PasswordEncrypter;

@Stateless(name = "LoginService", mappedName = "ejb/LoginService")
@DependsOn({ "UserRepository"})
public class LoginServiceBean implements LoginService{

	@EJB private UserRepository userRepository;
	
	@Override
	public User loginUser(String username, String password) {
		List<User> users = userRepository.getUserbyFilter(username);
		
		if (users.size() > 0){
			User u = users.get(0);
			
			if (u.getPassword().equals(PasswordEncrypter.GenerateHashedPassword(password, ""))){
				return u;
			}			
		}
		
		return null;
	}

}
