package com.bda.TrabajoPractico.Entidades;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="ESTACIONES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "LATITUD")
    private float latitud;

    @Column(name = "LONGITUD")
    private float longitud;

    @CreationTimestamp
    @Column(name = "FECHA_HORA_CREACION",updatable = false,insertable = false)
    private LocalDateTime fechaHoraCreacion;

	public Estacion(long id, String nombre, float latitud, float longitud, LocalDateTime fechaHoraCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.fechaHoraCreacion = fechaHoraCreacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public LocalDateTime getFechaHoraCreacion() {
		return fechaHoraCreacion;
	}

	public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
	}
    
    

}