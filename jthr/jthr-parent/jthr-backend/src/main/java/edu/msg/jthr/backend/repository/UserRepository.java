package edu.msg.jthr.backend.repository;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.User;

@Local
public interface UserRepository extends BaseRepository<User, Long> {
	
	List<User> getUserbyFilter(String pattern);
	
}
