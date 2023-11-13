package com.bda.TrabajoPractico.servicios;

import java.util.List;

import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;

public interface Service<T, ID> {
	AlquilerDto add(T entity);

	AlquilerDto update(T entity);

	T delete(ID id);

	T getById(ID id);

	List<T> getAll();

}
