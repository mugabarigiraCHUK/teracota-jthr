package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.Candidate;

public interface CandidateService {
	public void add(Candidate user);

	public void edit(Candidate user);

	public void delete(Long id);

	public Candidate getById(Long id);

	public List<Candidate> getAll();
}
