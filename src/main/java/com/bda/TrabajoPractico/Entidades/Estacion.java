package com.bda.TrabajoPractico.Entidades;

import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="ESTACIONES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Basic
	@Column(name= "NOMBRE")
    private String nombre;

	@Column(name= "LATITUD")
    private float latitud;
	
	@Column(name= "LONGITUD")
    private float longitud;

	@Column(name= "FECHA_HORA_CREACION")
    private Date fechaHoraCreacion;
	




}