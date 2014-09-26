package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.PositionRepository;
import edu.msg.jthr.backend.service.PositionService;

@Stateless (name="PositionService" , mappedName="ejb/PositionService")
@DependsOn ({"PositionRepository"})
public class PositionServiceBean implements PositionService {

	@EJB
	private PositionRepository repository;

	@Override
	public void addPosition(Position position) {
		// TODO Auto-generated method stub
	}

	@Override
	public void editPosition(Position Position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePosition(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Position getPositionById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> getAllPositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> getPositionbyFilter(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPositionComment(Comment comment, Long positionId) {
		// TODO Auto-generated method stub
		
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
