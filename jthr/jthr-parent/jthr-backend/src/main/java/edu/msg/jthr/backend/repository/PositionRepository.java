package edu.msg.jthr.backend.repository;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.model.User;

@Local
public interface PositionRepository extends BaseRepository<Position, Long> {
	
	List<User> getPositionbyFilter(String pattern);
	
}
