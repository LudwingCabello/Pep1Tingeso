package com.example.demo.Services;

import com.example.demo.Entities.ReporteDosEntity;
import com.example.demo.Repositories.ReporteDosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ReporteDosService {
    @Autowired
    ReporteDosRepository reporteDosRepository;

    public ReporteDosEntity getReporteById(int id) {return reporteDosRepository.findById(id);}

    public JList<ReporteDosEntity> getVehiculosByTipo(String tipo) {return (JList<ReporteDosEntity>) reporteDosRepository.findAllByTipo(tipo); }

    public ReporteDosEntity saveReporte(ReporteDosEntity reporteDos) {return reporteDosRepository.save(reporteDos);}


}
