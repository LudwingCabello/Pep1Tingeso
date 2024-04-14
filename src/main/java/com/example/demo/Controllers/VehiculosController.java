package com.example.demo.Controllers;

import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Services.VehiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
@CrossOrigin("*")
public class VehiculosController {
    @Autowired
    VehiculosService vehiculosService;

    @GetMapping("/")
    public ResponseEntity<List<VehiculosEntity>> listVehiculos(){
        List<VehiculosEntity> vehiculos = vehiculosService.getVehiculos();
        return ResponseEntity.ok(vehiculos);
        /*entro entidad respuesta con una lista de vehiculos
        * el .ok es que funciono , es para mandar dos valores al mismo tiempo
        * para guardar dos valores al mismo tiempo*/
    }

    @GetMapping ("/")
    public ResponseEntity<VehiculosEntity> getVehiculo(@RequestBody String patente){
        VehiculosEntity vehiculo = vehiculosService.getVehiculo(patente);
        return ResponseEntity.ok(vehiculo);
    }

    @GetMapping("/")
    public ResponseEntity<JList<VehiculosEntity>> getVehiculosByMarca(@RequestBody String marca){
        JList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByMarca(marca);
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping("/")
    public ResponseEntity<JList<VehiculosEntity>> getVehiculosByTipo(@RequestBody String tipo){
        JList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByTipo(tipo);
        return ResponseEntity.ok(vehiculos);
    }

    @GetMapping("/")
    public ResponseEntity<JList<VehiculosEntity>> getVehiculosByMotor(@RequestBody String motor){
        JList<VehiculosEntity> vehiculos = vehiculosService.getVehiculosByMotor(motor);
        return ResponseEntity.ok(vehiculos);
    }


    @PostMapping("/")
    public ResponseEntity<VehiculosEntity> saveVehiculo(@RequestBody VehiculosEntity vehiculo){
        VehiculosEntity vehiculoNew = vehiculosService.saveVehiculo(vehiculo);
        return ResponseEntity.ok(vehiculoNew);
    }


}
