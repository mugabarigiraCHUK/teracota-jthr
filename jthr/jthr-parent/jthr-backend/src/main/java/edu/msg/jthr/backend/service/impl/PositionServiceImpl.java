package edu.msg.jthr.backend.service.impl;

import java.util.List;

import javax.ejb.EJB;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.repository.impl.PositionDAOImpl;
import edu.msg.jthr.backend.service.PositionService;

public class PositionServiceImpl implements PositionService{
	@EJB private PositionDAOImpl positionDAO;

	@Override
	public void add(Position user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Position user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Position getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
