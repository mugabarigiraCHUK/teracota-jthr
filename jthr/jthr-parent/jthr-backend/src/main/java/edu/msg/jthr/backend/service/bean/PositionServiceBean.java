package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.CommentRepository;
import edu.msg.jthr.backend.repository.PositionRepository;
import edu.msg.jthr.backend.service.PositionService;

@Stateless(name = "PositionService", mappedName = "ejb/PositionService")
@DependsOn({ "PositionRepository", "CommentRepository" })
public class PositionServiceBean implements PositionService {

	@EJB
	private PositionRepository repository;
	@EJB
	private CommentRepository commentRepository;

	@Override
	public void addPosition(Position position) {
		repository.save(position);
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
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePositionComment(Comment comment, Long positionId) {
		// TODO Auto-generated method stub

	}
}
