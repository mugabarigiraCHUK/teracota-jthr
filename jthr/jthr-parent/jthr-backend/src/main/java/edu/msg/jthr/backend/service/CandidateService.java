package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.Candidate;

public interface CandidateService {
	
	void add(Candidate user);
	void edit(Candidate user);
	void delete(Long id);
	Candidate getById(Long id);
	List<Candidate> getAll();
}
