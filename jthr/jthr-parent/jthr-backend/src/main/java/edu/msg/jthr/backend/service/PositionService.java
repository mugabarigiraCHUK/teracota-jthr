package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;

@Local
public interface PositionService {

	void addPosition(Position position);

	void editPosition(Position Position);

	void deletePosition(Long id);

	Position getPositionById(Long id);

	List<Position> getAllPositions();

	List<Position> getPositionbyFilter(String pattern);
	
	void addPositionComment(Comment comment, Long positionId);
	
	void editPositionComment(Comment comment, Long positionId);
	
	void deletePositionComment(Comment comment, Long positionId);

}
