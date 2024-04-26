package com.example.demo.Services;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Repositories.ReporteUnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

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


    public int CosteReparacion(String motor, List<Integer> reparaciones) {
        int largo = reparaciones.size();
        int valorTotal = 0;
        for (int i=0; i < largo; i++){
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

    public double DescuentoXReparaciones(String motor, String fechaE, String fechaS, ArrayList<HistorialReparacionesEntity> lista ){
        int largo = lista.size();
        if (largo <= 2){
            if (motor.equals("gasolina")){
                return 0.05;
            }
            if (motor.equals("diesel")){
                return 0.07;
            }
            if (motor.equals("hibrido")){
                return 0.10;
            }
            if (motor.equals("electrico")){
                return 0.8;
            }
        }
        if (largo >= 3 && largo <= 5){
            if (motor.equals("gasolina")){
                return 0.10;
            }
            if (motor.equals("diesel")){
                return 0.12;
            }
            if (motor.equals("hibrido")){
                return 0.15;
            }
            if (motor.equals("electrico")){
                return 0.13;
            }
        }
        if (largo >= 6 && largo <= 9){
            if (motor.equals("gasolina")){
                return 0.15;
            }
            if (motor.equals("diesel")){
                return 0.17;
            }
            if (motor.equals("hibrido")){
                return 0.20;
            }
            if (motor.equals("electrico")){
                return 0.18;
            }
        }
        if (largo >= 10 ){
            if (motor.equals("gasolina")){
                return 0.20;
            }
            if (motor.equals("diesel")){
                return 0.22;
            }
            if (motor.equals("hibrido")){
                return 0.25;
            }
            if (motor.equals("electrico")){
                return 0.23;
            }
        };
        return 0;
    }

    public double DescuentoXDia(LocalDateTime fecha){
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        LocalTime horaIngreso = fecha.toLocalTime();
        LocalTime horaInicialDescuento = LocalTime.of(9,0);
        LocalTime horaFinalDescuento = LocalTime.of(12,0);

        if ((diaDeLaSemana == DayOfWeek.MONDAY || diaDeLaSemana == DayOfWeek.THURSDAY) &&
                (horaIngreso.isAfter(horaInicialDescuento) && horaIngreso.isBefore(horaFinalDescuento))){
            return 0.10;
        }
        return 0;
    }

    public double RecargoXKm(int km, String marca){
        if (km <= 5000){
            if (marca.equals("sedan")){
                return 0;
            }
            if (marca.equals("hatchback")){
                return 0;
            }
            if (marca.equals("suv")){
                return 0;
            }
            if (marca.equals("pickup")){
                return 0;
            }
            if (marca.equals("furgoneta")){
                return 0;
            }
        }
        if (km >= 5001 && km <= 12000){
            if (marca.equals("sedan")){
                return 0.03;
            }
            if (marca.equals("hatchback")){
                return 0.03;
            }
            if (marca.equals("suv")){
                return 0.05;
            }
            if (marca.equals("pickup")){
                return 0.05;
            }
            if (marca.equals("furgoneta")){
                return 0.05;
            }
        }
        if (km >= 12001 && km <= 25000){
            if (marca.equals("sedan")){
                return 0.07;
            }
            if (marca.equals("hatchback")){
                return 0.07;
            }
            if (marca.equals("suv")){
                return 0.09;
            }
            if (marca.equals("pickup")){
                return 0.09;
            }
            if (marca.equals("furgoneta")){
                return 0.09;
            }
        }
        if (km >= 25001 && km <= 40000){
            if (marca.equals("sedan")){
                return 0.12;
            }
            if (marca.equals("hatchback")){
                return 0.12;
            }
            if (marca.equals("suv")){
                return 0.12;
            }
            if (marca.equals("pickup")){
                return 0.12;
            }
            if (marca.equals("furgoneta")){
                return 0.12;
            }
        }
        if (km >= 40000 ){
            if (marca.equals("sedan")){
                return 0.2;
            }
            if (marca.equals("hatchback")){
                return 0.2;
            }
            if (marca.equals("suv")){
                return 0.2;
            }
            if (marca.equals("pickup")){
                return 0.2;
            }
            if (marca.equals("furgoneta")){
                return 0.2;
            }
        }
        return 0;
    }

    public int AntiguedadAuto(int yearFabricacion, LocalDateTime fechaSalida){
        int yearSalida = fechaSalida.getYear();
        int antiguedad = yearFabricacion - yearSalida;
        return antiguedad;
    }

    public double RecargoXRetraso(LocalDateTime fechaSalida, LocalDateTime fechaRetiro){
        long dias = ChronoUnit.DAYS.between(fechaSalida, fechaRetiro);
        return (dias * 0.05);
    }

    public String calcularReporteUno(String patente){
        ArrayList<HistorialReparacionesEntity> historial = historialReparacionesService.getHistorialByPatente(patente);
        VehiculosEntity auto = vehiculosService.getVehiculo(patente);
        int largo = historial.size();
        for (int i=0 ; i<largo ; i++) {
            int GastoReparaciones = CosteReparacion(auto.getTipo_motor(), historial.get(i).getReparaciones());
            //agregar funcionalidad de descuentoXreparacion
            double descuentoXDia = DescuentoXDia(historial.get(i).getFechaHoraIngreso());
            //agregar funcionalidad de bono
            double recargoXKm = RecargoXKm(auto.getKilometraje(), auto.getMarca());
            int antiguedad = AntiguedadAuto(auto.getYear_fabricacion(), historial.get(i).getFechaHoraSalida());
            double recargoXRetraso = RecargoXRetraso(historial.get(i).getFechaHoraSalida(), historial.get(i).getFechaHoraRetiro());

        }
        ReporteUnoEntity reporteUnoEntity = new ReporteUnoEntity();




        return "index";
    }
}
