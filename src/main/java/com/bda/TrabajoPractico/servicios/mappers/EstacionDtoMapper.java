package com.bda.TrabajoPractico.servicios.mappers;

import java.util.function.Function;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;
import com.bda.TrabajoPractico.Entidades.dto.EstacionDto;

public class EstacionDtoMapper implements Function<Estacion, EstacionDto> {

	@Override
	public EstacionDto apply(Estacion t) {
		return new EstacionDto(t.getId(), t.getNombre(), t.getLatitud(), t.getLongitud(), t.getFechaHoraCreacion());
	}

}
