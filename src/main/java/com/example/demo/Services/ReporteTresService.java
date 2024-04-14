package com.example.demo.Services;

import com.example.demo.Entities.ReporteDosEntity;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class ReporteTresService {

    public JList<ReporteDosEntity> getReporteByMarca(String marca) {return (JList<ReporteDosEntity>) reporteDosRepository.findAllByMarca(marca); }

}
