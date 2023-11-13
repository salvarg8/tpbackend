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
    
    
	public AlquilerDto(Integer id, Estacion estacion, Estacion estacionDevolucion, Date salida, Date llegada,
			int cliente, Tarifa tarifa) {
		this.id = id;
		this.estacion = estacion;
		this.estacionDevolucion=estacionDevolucion;
		this.salida =salida;
		this.llegada = llegada;
		this.cliente = cliente;
		this.tarifa = tarifa;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Estacion getEstacion() {
		return estacion;
	}


	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}


	public Estacion getEstacionDevolucion() {
		return estacionDevolucion;
	}


	public void setEstacionDevolucion(Estacion estacionDevolucion) {
		this.estacionDevolucion = estacionDevolucion;
	}


	public Date getSalida() {
		return salida;
	}


	public void setSalida(Date salida) {
		this.salida = salida;
	}


	public Date getLlegada() {
		return llegada;
	}


	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}


	public int getCliente() {
		return cliente;
	}


	public void setCliente(int cliente) {
		this.cliente = cliente;
	}


	public Tarifa getTarifa() {
		return tarifa;
	}


	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	
	
	
}
