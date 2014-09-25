package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.Position;

public interface PositionService {
	void add(Position user);
	void edit(Position user);
	void delete(Long id);
	Position getById(Long id);
	List<Position> getAll();
}
