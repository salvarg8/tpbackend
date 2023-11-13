package com.bda.TrabajoPractico.Entidades;

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
@Table(name="TARIFAS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tarifa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="TIPO_TARIFA")
	private int tipoTarifa;
	@Column(name="DEFINICION")
	private char Definicion;
	@Column(name="DIA_SEMANA")
	private int diaSemana;
	@Column(name="DIA_MES")
	private int diaMes;
	@Column(name="MES")
	private int mes;
	@Column(name="ANIO")
	private int año;
	@Column(name="MONTO_FIJO_ALQUILER")
	private float montoFijoAlquiler;
	@Column(name="MONTO_FIJO_FRACCION")
	private float montoMinutoFraccion;
	@Column(name="MONTO_KM")
	private float montoKm;

	@Column(name="MONTO_HORA")
	private float montoHora;

	

}