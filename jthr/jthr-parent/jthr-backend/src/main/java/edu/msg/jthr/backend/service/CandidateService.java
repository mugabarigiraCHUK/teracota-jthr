package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;

@Local
public interface CandidateService {
	void addCandidate(Candidate candidate);

	void editCandidate(Candidate candidate);

	void deleteCandidate(Candidate candidate);

	Candidate getCandidateById(Long id);

	List<Candidate> getAllCandidates();

	void addCandidateComment(Comment comment, Long candidateId);

	void editCandidateComment(Comment com, long parseLong);

	void deleteCandidateComment(Comment com, long parseLong);
	
	List<Candidate> getNonCandidates(Position p);
}
