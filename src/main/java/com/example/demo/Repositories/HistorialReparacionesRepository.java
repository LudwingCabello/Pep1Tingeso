package com.example.demo.Repositories;

import com.example.demo.Entities.HistorialReparacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface HistorialReparacionesRepository extends JpaRepository<HistorialReparacionesEntity, String> {

    public JList<HistorialReparacionesEntity> ListReparaciones(String tipo_reparacion);

    public JList<HistorialReparacionesEntity> findByTipoReparacion(String tipo_reparacion);



}
