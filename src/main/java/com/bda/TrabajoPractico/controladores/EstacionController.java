package com.bda.TrabajoPractico.controladores;

import com.bda.TrabajoPractico.Entidades.Estacion;
import com.bda.TrabajoPractico.servicios.interfaces.EstacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estaciones")
public class EstacionController {

    private final EstacionService estacionService;

    @Autowired
    public EstacionController(EstacionService estacionService){
        this.estacionService = estacionService;
    }

    @GetMapping
    public List<Estacion> getAll(){
        return estacionService.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Estacion> save(@RequestBody Estacion estacion){
        System.out.println(estacion);
        return ResponseEntity.ok(estacionService.add(estacion));
    }
}
