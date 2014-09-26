package edu.msg.jthr.backend.repository;

import java.util.List;

import edu.msg.jthr.backend.model.Position;

public interface PositionRepository extends BaseRepository<Position, Long>{
	List<Position> getPositionByApproval() throws RepositoryException;
	
	List<Position> getPositionByName(String positionName) throws RepositoryException;
}
