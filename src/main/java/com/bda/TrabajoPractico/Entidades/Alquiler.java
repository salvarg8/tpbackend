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
	private int id;
	
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

   
}