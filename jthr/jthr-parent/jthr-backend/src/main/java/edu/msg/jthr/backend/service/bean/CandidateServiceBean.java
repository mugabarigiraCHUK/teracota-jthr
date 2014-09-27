package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.CandidateRepository;
import edu.msg.jthr.backend.repository.CommentRepository;
import edu.msg.jthr.backend.service.CandidateService;

@Stateless(name = "CandidateService", mappedName = "ejb/CandidateService")
@DependsOn({ "CandidateRepository" })
public class CandidateServiceBean implements CandidateService {

	@EJB
	private CandidateRepository repository;
	@EJB
	private CommentRepository commentRepository;

	@Override
	public void addCandidate(Candidate candidate) {
		repository.save(candidate);

	}

	@Override
	public void addCandidateComment(Comment comment, Long candidateId) {
		Candidate c = repository.getById(candidateId);
		Comment com = commentRepository.save(comment);
		c.getComments().add(com);
		editCandidate(c);
	}

	@Override
	public void editCandidate(Candidate candidate) {
		repository.merge(candidate);

	}

	@Override
	public void deleteCandidate(Candidate candidate) {
		repository.delete(candidate);

	}

	@Override
	public Candidate getCandidateById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Candidate> getAllCandidates() {
		return repository.getAll();
	}

	@Override
	public void editCandidateComment(Comment com, long parseLong) {
		commentRepository.merge(com);

	}

	@Override
	public void deleteCandidateComment(Comment com, long candidateId) {
		Candidate c = repository.getById(candidateId);
		c.getComments().remove(com);
		commentRepository.delete(com);
		editCandidate(c);

	}
}
