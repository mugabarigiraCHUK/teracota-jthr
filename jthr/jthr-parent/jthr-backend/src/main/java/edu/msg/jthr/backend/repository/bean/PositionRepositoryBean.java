package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.PositionRepository;

@Stateless(name = "PositionRepository", mappedName = "ejb/PositionRepository")
public class PositionRepositoryBean extends BaseRepositoryBean<Position, Long>
		implements PositionRepository {

	public PositionRepositoryBean() {
		super(Position.class);
	}

	@Override
	public List<Position> getPositionbyFilter(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}
