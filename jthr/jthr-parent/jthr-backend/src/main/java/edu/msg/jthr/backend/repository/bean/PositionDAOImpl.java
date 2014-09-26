package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.BaseRepository;

@Stateless
public class PositionDAOImpl implements BaseRepository<Position, Long> {

	@Override
	public Position save(Position e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position merge(Position e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Position e) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Position> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
