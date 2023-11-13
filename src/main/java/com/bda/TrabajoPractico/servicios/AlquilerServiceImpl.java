package com.bda.TrabajoPractico.servicios;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;
import com.bda.TrabajoPractico.repositorios.AlquilerRepository;
import com.bda.TrabajoPractico.servicios.mappers.AlquilerDtoMapper;
import com.bda.TrabajoPractico.servicios.mappers.AlquilerMapper;

@Service
public class AlquilerServiceImpl implements AlquilerService {

	private AlquilerRepository alquilerRepository;
	private final AlquilerDtoMapper mapperDto;
	private final AlquilerMapper mapper;

	public AlquilerServiceImpl(AlquilerRepository alquilerRpository, AlquilerDtoMapper mapperDto,
			AlquilerMapper mapper) {
		this.alquilerRepository = alquilerRepository;
		this.mapperDto = mapperDto;
		this.mapper = mapper;
	}

	@Override
	public void add(AlquilerDto entity) {
		Optional<Alquiler> alquiler = Stream.of(entity).map(mapper).findFirst();
		alquiler.ifPresent(alquilerRepository::save);

	}

	@Override
	public void update(AlquilerDto entity) {
		Optional<Alquiler> alquiler = Stream.of(entity).map(mapper).findFirst();
		alquiler.ifPresent(alquilerRepository::save);
	}

	@Override
	public AlquilerDto delete(Long id) {
		AlquilerDto alquiler = this.getById(id);
		if (alquiler != null) {
			Optional<Alquiler> entity = Stream.of(alquiler).map(mapper).findFirst();
			entity.ifPresent(alquilerRepository::delete);
		}

		return alquiler;
	}

	@Override
	public AlquilerDto getById(Long id) {
		Optional<Alquiler> alquiler = this.alquilerRepository.findById(id);
		return alquiler.map(mapperDto).orElseThrow();
	}

	@Override
	public List<AlquilerDto> getAll() {
		List<Alquiler> alquileres = this.alquilerRepository.findAll();
		return alquileres.stream().map(mapperDto).toList();
	}

}
