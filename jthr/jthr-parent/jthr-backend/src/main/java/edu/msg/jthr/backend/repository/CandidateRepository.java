package edu.msg.jthr.backend.repository;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Candidate;

@Local
public interface CandidateRepository extends BaseRepository<Candidate, Long> {
}
