package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Role;

@Local
public interface RoleService {

	void addRole(Role role);
	void editRole(Role role);
	void deleteRole(Role role);
	Role getRoleById(Long id);
	List<Role> getAllRoles();
	
}
