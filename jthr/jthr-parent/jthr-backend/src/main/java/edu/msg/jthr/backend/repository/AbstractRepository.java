package edu.msg.jthr.backend.repository;

import java.util.List;


public interface AbstractRepository<T> {
	public T add(T e);
	public T update(T e);
	public T delete(T e);
	public List<T> getAll();
	public T get(Long id);
}
