package com.bda.TrabajoPractico.servicios.implementaciones;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.repositorios.AlquilerRepository;
import com.bda.TrabajoPractico.servicios.interfaces.AlquilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlquilerServiceImpl implements AlquilerService {

    private final AlquilerRepository alquilerRepository;

    @Autowired
    public AlquilerServiceImpl(AlquilerRepository alquilerRepository){
        this.alquilerRepository=alquilerRepository;
    }
    @Override
    public Alquiler add(Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }

    @Override
    public List<Alquiler> getAll() {
        return alquilerRepository.findAll();
    }

    @Override
    public Alquiler getById(Integer id) {
        return alquilerRepository.findById(id).get();
    }

    @Override
    public void update(Alquiler alquiler) {
        alquilerRepository.save(alquiler);
    }

    @Override
    public void delete(Integer id) {
        alquilerRepository.deleteById(id);
    }
}
