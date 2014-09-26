package edu.msg.jthr.backend.repository.bean;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Role;
import edu.msg.jthr.backend.repository.RoleRepository;

@Stateless (name="RoleRepository", mappedName="ejb/RoleRepository")
public class RoleRepositoryBean extends BaseRepositoryBean<Role, Long> implements RoleRepository{

	public RoleRepositoryBean() {
		super(Role.class);
	}

}
