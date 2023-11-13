package com.bda.TrabajoPractico.Entidades;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="ALQUILERES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name= "ESTACION_RETIRO" )
    private Estacion estacion;
	
	@OneToOne
	@JoinColumn(name= "ESTACION_DEVOLUCION" )
    private Estacion estacionDevolucion;
	
	@Column (name="FECHA_HORA_RETIRO")
    private Date salida;
	
	@Column (name="FECHA_HORA_DEVOLUCION")
    private Date llegada;
	
	
	@Column(name= "ID_CLIENTE" )
    private int cliente;
	
	@OneToOne
	@JoinColumn(name= "ID_TARIFA" )
    private Tarifa tarifa;

	public Alquiler(int id, Estacion estacion, Estacion estacionDevolucion, Date llegada, Date salida,
			Tarifa tarifa, int cliente) {
		this.cliente=cliente;
		this.estacion=estacion;
		this.estacionDevolucion =estacionDevolucion;
		this.id = id;
		this.llegada =llegada;
		this.salida = salida;
		this.tarifa = tarifa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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