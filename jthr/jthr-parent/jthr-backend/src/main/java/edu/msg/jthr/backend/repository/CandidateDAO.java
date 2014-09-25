package edu.msg.jthr.backend.repository;

import java.util.List;

import edu.msg.jthr.backend.model.Candidate;

public interface CandidateDAO {
	public void addCandidate(Candidate candidate);

	public void editCandidate(Candidate candidate);

	public void deleteCandidate(Candidate candidate);

	public List<Candidate> getAllCandidates();

	public Candidate getCandidateById(Long id);

}
