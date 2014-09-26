package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Candidate;

@Local
public interface CandidateService {
	void addCandidate(Candidate candidate);

	void editCandidate(Candidate candidate);

	void deleteCandidate(Candidate candidate);

	Candidate getCandidateById(Long id);

	List<Candidate> getAllCandidates();
}
