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
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "LATITUD")
    private float latitud;

    @Column(name = "LONGITUD")
    private float longitud;

    @CreationTimestamp
    @Column(name = "FECHA_HORA_CREACION",updatable = false,insertable = false)
    private LocalDateTime fechaHoraCreacion;

}