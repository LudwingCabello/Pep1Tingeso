package com.example.demo.Controllers;

import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Services.ReporteUnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reporteuno")
@CrossOrigin("*")
public class ReporteUnoController {
    @Autowired
    ReporteUnoService reporteUnoService;

    @GetMapping("/")
    public ResponseEntity<ReporteUnoEntity> getReporteById(@RequestBody int id ){
        ReporteUnoEntity reporte = reporteUnoService.getReporteById(id);
        return ResponseEntity.ok(reporte);
    }

    @GetMapping ("/")
    public ResponseEntity<ReporteUnoEntity> getVehiculo(@RequestBody String patente){
        ReporteUnoEntity vehiculo = reporteUnoService.getVehiculo(patente);
        return ResponseEntity.ok(vehiculo);
    }

    @PostMapping ("/")
    public ResponseEntity<ReporteUnoEntity> saveReporte(@RequestBody ReporteUnoEntity reporte){
        ReporteUnoEntity reporteNew = reporteUnoService.saveReporte(reporte);
        return ResponseEntity.ok(reporteNew);
    }




}
