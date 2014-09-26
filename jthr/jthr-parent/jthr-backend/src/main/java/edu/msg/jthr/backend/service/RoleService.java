package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Role;

@Local
public interface RoleService {

	void addUser(Role role);
	void editUser(Role role);
	void deleteUser(Role role);
	Role getRoleById(Long id);
	List<Role> getAllRoles();
	
}
