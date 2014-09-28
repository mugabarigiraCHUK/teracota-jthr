package edu.msg.jthr.backend.repository;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Project;

@Local
public interface ProjectRepository extends BaseRepository<Project, Long> {

}
