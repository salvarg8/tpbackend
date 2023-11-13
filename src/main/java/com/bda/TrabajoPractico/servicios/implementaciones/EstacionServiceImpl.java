package com.bda.TrabajoPractico.servicios.implementaciones;

import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.Entidades.dto.EstacionDto;
import com.bda.TrabajoPractico.repositorios.EstacionRepository;
import com.bda.TrabajoPractico.servicios.interfaces.EstacionService;
import com.bda.TrabajoPractico.servicios.mappers.EstacionDtoMapper;
import com.bda.TrabajoPractico.servicios.mappers.EstacionMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class EstacionServiceImpl implements EstacionService {

	private final EstacionRepository estacionRepository;
	private final EstacionDtoMapper mapperDto;
	private final EstacionMapper mapper;

	@Autowired
	public EstacionServiceImpl(EstacionRepository estacionRepository, EstacionDtoMapper mapperDto,
			EstacionMapper mapper) {
		this.estacionRepository = estacionRepository;
		this.mapperDto = mapperDto;
		this.mapper = mapper;
	}

	@Override
	public EstacionDto add(EstacionDto entity) {
		Optional<Estacion> estacion = Stream.of(entity).map(mapper).findFirst();
		try {
			estacion.ifPresent(estacionRepository::save);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return estacion.map(mapperDto).orElseThrow();
	}

	@Override
	public List<EstacionDto> getAll() {
		return estacionRepository.findAll();
	}

	@Override
	public EstacionDto getById(long id) {
		return estacionRepository.findById(id).get();
	}

	@Override
	public EstacionDto update(EstacionDto estacion) {
		Optional<Estacion> estacion = Stream.of(entity).map(mapper).findFirst();
		try {
			estacion.ifPresent(estacionRepository::save);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return estacion.map(mapperDto).orElseThrow();	}

	@Override
	public void delete(long id) {
		estacionRepository.deleteById(id);
	}
}
