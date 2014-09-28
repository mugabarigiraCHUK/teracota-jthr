package edu.msg.jthr.backend.repository;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Interview;

@Local
public interface InterviewRepository extends BaseRepository<Interview, Long> {

}
