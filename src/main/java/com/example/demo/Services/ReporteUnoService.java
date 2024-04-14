package com.example.demo.Services;

import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Entities.VehiculosEntity;
import com.example.demo.Repositories.ReporteDosRepository;
import com.example.demo.Repositories.ReporteUnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ReporteUnoService {
    @Autowired
    ReporteUnoRepository reporteUnoRepository;

    public ReporteUnoEntity getReporteById(int id) {return  reporteUnoRepository.findById(id);}

    public ReporteUnoEntity getVehiculo(String patente) {return  reporteUnoRepository.findByPatente(patente);}

    public ReporteUnoEntity saveReporte(ReporteUnoEntity reporteUno) {return reporteUnoRepository.save(reporteUno);}



}
