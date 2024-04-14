package com.example.demo.Controllers;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Services.HistorialReparacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
@RequestMapping("/HistorialReparaciones")
@CrossOrigin("*")
public class HistorialReparacionesController {
    @Autowired
    HistorialReparacionesService historialReparacionesService;

    @GetMapping("/")
    public ResponseEntity<JList<HistorialReparacionesEntity>> getTipoReparacion(@RequestBody String tipo_reparacion){
        JList<HistorialReparacionesEntity> reparaciones = historialReparacionesService.getByTipoReparacion(tipo_reparacion);
        return ResponseEntity.ok(reparaciones);
    }

    @PostMapping("/")
    public ResponseEntity<HistorialReparacionesEntity> saveHistorial(@RequestBody HistorialReparacionesEntity historial){
        HistorialReparacionesEntity historialNew = historialReparacionesService.saveHistorial(historial);
        return ResponseEntity.ok(historialNew);
    }

}
