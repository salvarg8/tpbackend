package com.bda.TrabajoPractico.servicios.implementaciones;

import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.repositorios.EstacionRepository;
import com.bda.TrabajoPractico.servicios.interfaces.EstacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionServiceImpl implements EstacionService {

    private final EstacionRepository estacionRepository;

    @Autowired
    public EstacionServiceImpl(EstacionRepository estacionRepository){
        this.estacionRepository=estacionRepository;
    }

    @Override
    public Estacion add(Estacion estacion) {
        return estacionRepository.save(estacion);
    }

    @Override
    public List<Estacion> getAll() {
        return estacionRepository.findAll();
    }

    @Override
    public Estacion getById(Integer id) {
        return estacionRepository.findById(id).get();
    }

    @Override
    public void update(Estacion estacion) {
        estacionRepository.save(estacion);
    }

    @Override
    public void delete(Integer id) {
        estacionRepository.deleteById(id);
    }
}
