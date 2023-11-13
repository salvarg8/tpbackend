package com.bda.TrabajoPractico.servicios.implementaciones;

import com.bda.TrabajoPractico.Entidades.Tarifa;
import com.bda.TrabajoPractico.repositorios.TarifaRepository;
import com.bda.TrabajoPractico.servicios.interfaces.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarifaServiceImpl implements TarifaService {
    private final TarifaRepository tarifaRepository;

    @Autowired
    public TarifaServiceImpl(TarifaRepository tarifaRepository){
        this.tarifaRepository=tarifaRepository;
    }
    @Override
    public Tarifa add(Tarifa tarifa) {
        return tarifaRepository.save(tarifa);
    }

    @Override
    public List<Tarifa> getAll() {
        return tarifaRepository.findAll();
    }

    @Override
    public Tarifa getById(Integer id) {
        return tarifaRepository.findById(id).get();
    }

    @Override
    public void update(Tarifa tarifa) {
        tarifaRepository.save(tarifa);
    }

    @Override
    public void delete(Integer id) {
        tarifaRepository.deleteById(id);
    }
}
