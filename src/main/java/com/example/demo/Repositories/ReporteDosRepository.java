package com.example.demo.Repositories;

import com.example.demo.Entities.ReporteDosEntity;
import com.example.demo.Entities.VehiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface ReporteDosRepository extends JpaRepository<ReporteDosEntity, Integer> {
    public ReporteDosEntity findById(int id);
    public JList<ReporteDosEntity> findAllByTipo(String tipo);
}
