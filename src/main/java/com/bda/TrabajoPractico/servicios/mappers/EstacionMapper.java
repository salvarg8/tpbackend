package com.bda.TrabajoPractico.servicios.mappers;

import java.util.function.Function;

import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.Entidades.dto.EstacionDto;

public class EstacionMapper implements Function<EstacionDto, Estacion> {

	@Override
	public Estacion apply(EstacionDto t) {
		return new Estacion(t.getId(), t.getNombre(), t.getLatitud(), t.getLongitud(), t.getFechaHoraCreacion());
	}

}
