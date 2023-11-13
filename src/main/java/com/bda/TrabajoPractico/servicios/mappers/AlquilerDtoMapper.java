package com.bda.TrabajoPractico.servicios.mappers;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;


@Service
public class AlquilerDtoMapper implements Function<Alquiler, AlquilerDto> {
	@Override
	public AlquilerDto apply(Alquiler t) {
		// TODO Auto-generated method stub
		return new AlquilerDto(
				t.getId(),
				t.getEstacion(),
				t.getEstacionDevolucion(),
				t.getSalida(),
				t.getLlegada(),
				t.getCliente(),
				t.getTarifa()
				);
	}
}
