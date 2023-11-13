package com.bda.TrabajoPractico.servicios;

import java.util.List;

public interface Service<T, ID> {
	void add(T entity);

	void update(T entity);

	T delete(ID id);

	T getById(ID id);

	List<T> getAll();

}
