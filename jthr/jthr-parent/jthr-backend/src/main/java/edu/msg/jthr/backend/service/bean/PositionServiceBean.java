package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityExistsException;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.CandidateRepository;
import edu.msg.jthr.backend.repository.CommentRepository;
import edu.msg.jthr.backend.repository.PositionRepository;
import edu.msg.jthr.backend.service.PositionService;

@Stateless(name = "PositionService", mappedName = "ejb/PositionService")
@DependsOn({ "PositionRepository", "CommentRepository", "CandidateRepository" })
public class PositionServiceBean implements PositionService {

	@EJB
	private PositionRepository repository;
	@EJB
	private CommentRepository commentRepository;
	@EJB
	private CandidateRepository candidateRepository;

	@Override
	public void addPosition(Position position) {
		try {
			// Try to insert your entity by calling persist method
			repository.save(position);
		} catch (EntityExistsException e) {
			// Entity you are trying to insert already exist, then call merge method
			repository.merge(position);
		}
	}

	@Override
	public void editPosition(Position position) {
		repository.merge(position);

	}

	@Override
	public void deletePosition(Position position) {
		repository.delete(position);

	}

	@Override
	public Position getPositionById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Position> getAllPositions() {
		return repository.getAll();
	}

	@Override
	public List<Position> getPositionbyFilter(String pattern) {
		return repository.getPositionbyFilter(pattern);
	}

	@Override
	public void addPositionComment(Comment comment, Long positionId) {
		Position p = repository.getById(positionId);
		Comment c = commentRepository.save(comment);
		p.getComments().add(c);
		editPosition(p);
	}

	@Override
	public void editPositionComment(Comment comment, Long positionId) {
		commentRepository.merge(comment);
	}

	@Override
	public void deletePositionComment(Comment comment, Long positionId) {
		Position p = repository.getById(positionId);
		p.getComments().remove(comment);
		commentRepository.delete(comment);
		editPosition(p);
	}

	@Override
	public void closePosition(Long id) {
		Position p = repository.getById(id);
		p.setIsClosed(true);
		repository.merge(p);
	}

	@Override
	public void approvePosition(Long id) {
		Position p = repository.getById(id);
		p.setIsApproved(true);
		repository.merge(p);
	}

	@Override
	public void addCandidateToPosition(Long candidateId, Long positionId) {
		Position p = repository.getById(positionId);
		p.getCandidates().add(candidateRepository.getById(candidateId));
		editPosition(p);
	}

	@Override
	public void removeCandidateFromPosition(Long candidateId, Long positionId) {
		Position p = repository.getById(positionId);
		p.getCandidates().remove(candidateRepository.getById(candidateId));
		editPosition(p);
	}

	@Override
	public void acceptCandidateToPosition(Long candidateId, Long positionId) {
		Position p = repository.getById(positionId);
		p.getCandidates().remove(candidateRepository.getById(candidateId));
		p.getAcceptedCandidates().add(candidateRepository.getById(candidateId));
		if (p.getAcceptedCandidates().size() == p.getNrOfPlaces()){
			p.setIsClosed(true);
		}
		editPosition(p);
	}
}
