package edu.msg.jthr.backend.repository;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.AbstractModel;

@Local
public interface BaseRepository<T extends AbstractModel, I> {

	T save(T e);

	T merge(T e);

	void delete(T e);

	List<T> getAll();

	T getById(I id);
}
