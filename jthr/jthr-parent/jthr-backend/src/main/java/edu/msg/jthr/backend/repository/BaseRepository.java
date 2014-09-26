package edu.msg.jthr.backend.repository;

import java.util.List;

import edu.msg.jthr.backend.model.AbstractModel;


public interface BaseRepository<T extends AbstractModel, I> {
	public T save(T e);
	public T merge(T e);
	public T delete(T e);
	public List<T> getAll();
	public T getById(I id);
}
