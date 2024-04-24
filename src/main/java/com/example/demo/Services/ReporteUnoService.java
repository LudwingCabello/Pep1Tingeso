package com.example.demo.Services;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Repositories.ReporteUnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReporteUnoService {
    @Autowired
    ReporteUnoRepository reporteUnoRepository;

    @Autowired
    VehiculosService vehiculosService;

    @Autowired
    HistorialReparacionesService historialReparacionesService;

    public ReporteUnoEntity getReporteById(int id) {return  reporteUnoRepository.findById(id);}

    public ReporteUnoEntity getVehiculo(String patente) {return  reporteUnoRepository.findByPatente(patente);}

    public ReporteUnoEntity saveReporte(ReporteUnoEntity reporteUno) {return reporteUnoRepository.save(reporteUno);}

    public int CosteReparacion(String motor, ArrayList<HistorialReparacionesEntity> lista) {
        int largo = lista.size();
        int valorTotal = 0;
        for (int i=0; i < largo; i++){
            ArrayList<Integer> reparaciones = (ArrayList<Integer>) lista.get(i).getReparaciones();
            if (reparaciones.contains(1)){ //contains revisa si existe ese numero
                if (motor.equals("gasolina")){
                    valorTotal = valorTotal + 120000;
                }
                if (motor.equals("diesel")){
                    valorTotal = valorTotal + 120000;
                }
                if (motor.equals("hibrido")){
                    valorTotal = valorTotal + 180000;
                }
                if (motor.equals("electrico")){
                    valorTotal = valorTotal + 220000;

                }
            }
            if (reparaciones.contains(2)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 130000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 130000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 190000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 230000;
                }
            }
            if (reparaciones.contains(3)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 350000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 450000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 700000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 800000;
                }
            }
            if (reparaciones.contains(4)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 210000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 210000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 300000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 300000;
                }
            }

            if (reparaciones.contains(5)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 150000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 150000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 200000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 250000;
                }
            }
            if (reparaciones.contains(6)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 100000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 120000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 450000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 0;
                }
            }
            if (reparaciones.contains(7)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 100000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 100000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 100000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 100000;
                }
            }
            if (reparaciones.contains(8)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 180000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 180000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 210000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 250000;
                }
            }

            if (reparaciones.contains(9)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 150000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 150000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 180000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 180000;
                }
            }

            if (reparaciones.contains(10)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 130000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 140000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 220000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 0;
                }
            }

            if (reparaciones.contains(11)) {
                if (motor.equals("gasolina")) {
                    valorTotal = valorTotal + 80000;
                }
                if (motor.equals("diesel")) {
                    valorTotal = valorTotal + 80000;
                }
                if (motor.equals("hibrido")) {
                    valorTotal = valorTotal + 80000;
                }
                if (motor.equals("electrico")) {
                    valorTotal = valorTotal + 80000;
                }
            }
        }
        return valorTotal;
    }

    public String calcularReporteUno(String patente){
        ArrayList<HistorialReparacionesEntity> historial = historialReparacionesService.getHistorialByPatente(patente);
        VehiculosEntity auto = vehiculosService.getVehiculo(patente);




    }


}
