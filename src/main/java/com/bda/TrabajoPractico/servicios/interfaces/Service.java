package com.bda.TrabajoPractico.servicios.interfaces;

import java.util.List;

public interface Service<E,ID> {
    E add(E e);
    List<E>getAll();
    E getById(ID id);
    void update(E e);
    void delete(ID id);
}
