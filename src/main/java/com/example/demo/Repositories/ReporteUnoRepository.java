package com.example.demo.Repositories;

import com.example.demo.Entities.ReporteUnoEntity;
import com.example.demo.Entities.VehiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface ReporteUnoRepository extends JpaRepository<ReporteUnoEntity, String> {
    public ReporteUnoEntity findById(Long id);
    public ReporteUnoEntity findByPatente(String patente);


}
