package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.Position;

public interface PositionService {
	public void add(Position user);
	public void edit(Position user);
	public void delete(Long id);
	public Position getById(Long id);
	public List<Position> getAll();
}
