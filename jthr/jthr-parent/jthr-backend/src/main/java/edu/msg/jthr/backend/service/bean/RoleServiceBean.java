package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Role;
import edu.msg.jthr.backend.repository.RoleRepository;
import edu.msg.jthr.backend.service.RoleService;

@Stateless (name="RoleService" , mappedName="ejb/RoleService")
@DependsOn ({"RoleRepository"})
public class RoleServiceBean implements RoleService {

	@EJB
	private RoleRepository repository;
	
	@Override
	public void addUser(Role role) {
		repository.save(role);
		
	}

	@Override
	public void editUser(Role role) {
		repository.merge(role);
		
	}

	@Override
	public void deleteUser(Role role) {
		repository.delete(role);
		
	}

	@Override
	public Role getRoleById(Long id) {
		
		return repository.getById(id);
	}

	@Override
	public List<Role> getAllRoles() {
		
		return repository.getAll();
	}

}
