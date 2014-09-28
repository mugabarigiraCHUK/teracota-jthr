package edu.msg.jthr.backend.repository;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Role;

@Local
public interface RoleRepository extends BaseRepository<Role, Long> {

}
