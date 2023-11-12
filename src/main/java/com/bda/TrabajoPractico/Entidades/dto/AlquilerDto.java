package com.bda.TrabajoPractico.Entidades.dto;

import java.util.Date;

import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.Entidades.Tarifa;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlquilerDto {
	

	private int id;
    private Estacion estacion;	
    private Estacion estacionDevolucion;	
    private Date salida;	
    private Date llegada;
    private int cliente;
    private Tarifa tarifa;
}
