package com.example.demo.Repositories;

import com.example.demo.Entities.VehiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface VehiculosRepository extends JpaRepository<VehiculosEntity, String> {
    public VehiculosEntity findByPatente(String patente);
    public JList<VehiculosEntity> findAllByMarca(String marca);
    public JList<VehiculosEntity> findAllByTipo(String tipo);
    public JList<VehiculosEntity> findAllByMotor(String tipo_motor);





}
