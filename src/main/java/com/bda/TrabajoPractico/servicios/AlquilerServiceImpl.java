package com.bda.TrabajoPractico.servicios;

import java.util.List;
import java.util.stream.Stream;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;
import com.bda.TrabajoPractico.repositorios.AlquilerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.JpqlParser.New_valueContext;
import org.springframework.stereotype.Service;


@Service
public class AlquilerServiceImpl implements AlquilerService{

	private AlquilerRepository alquilerRepository;
	
	public AlquilerServiceImpl(AlquilerRepository alquilerRpository) {
		this.alquilerRepository = alquilerRepository;
	}
	
	
	@Override
	public void add(AlquilerDto entity) {
		this.alquilerRepository.save(entity);
	}

	@Override
	public void update(AlquilerDto entity) {
		this.alquilerRepository.save(entity);
	}

	@Override
	public AlquilerDto delete(Long id) {
		Alquiler alquiler = this.getById(id);
		this.alquilerRepository.delete(alquiler);
		return alquiler;
	}

	@Override
	public AlquilerDto getById(Long id) {
		return this.alquilerRepository.findById(id).orElseThrow();
	}

	@Override
	public List<AlquilerDto> getAll() {
		List<Alquiler> alquileres = this.alquilerRepository.findAll();
		return alquileres
				.stream()
				.map(a  -> new AlquilerDto(
						a.getId(),
						a.getEstacion(),
						a.getEstacionDevolucion(),
						a.getSalida(),
						a.getLlegada(),
						a.getCliente(),
						a.getTarifa()
						)).toList();
		}

}
