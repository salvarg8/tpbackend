package com.bda.TrabajoPractico.servicios.mappers;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.bda.TrabajoPractico.Entidades.Alquiler;
import com.bda.TrabajoPractico.Entidades.dto.AlquilerDto;


@Service
public class AlquilerMapper implements Function<AlquilerDto,Alquiler>{

	@Override
	public Alquiler apply(AlquilerDto t) {
		return new Alquiler(t.getId(),t.getEstacion(),t.getEstacionDevolucion(),t.getLlegada(),t.getSalida(),t.getTarifa(),t.getCliente());
		
	}



}
