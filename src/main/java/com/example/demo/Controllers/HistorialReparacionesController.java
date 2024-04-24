package com.example.demo.Controllers;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Services.HistorialReparacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/HistorialReparaciones")
@CrossOrigin("*")
public class HistorialReparacionesController {
    @Autowired
    HistorialReparacionesService historialReparacionesService;


    @GetMapping("/")
    public ResponseEntity<ArrayList<HistorialReparacionesEntity>> getHistorialByPatente(@RequestBody String patente){
        ArrayList<HistorialReparacionesEntity> historial = historialReparacionesService.getHistorialByPatente(patente);
        return ResponseEntity.ok(historial);
    }

    @PostMapping("/")
    public ResponseEntity<HistorialReparacionesEntity> saveHistorial(@RequestBody HistorialReparacionesEntity historial){
        HistorialReparacionesEntity historialNew = historialReparacionesService.saveHistorial(historial);
        return ResponseEntity.ok(historialNew);
    }

}
