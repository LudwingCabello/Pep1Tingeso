package com.example.demo.Services;

import com.example.demo.Entities.HistorialReparacionesEntity;
import com.example.demo.Repositories.HistorialReparacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class HistorialReparacionesService {
    @Autowired
    HistorialReparacionesRepository historialReparacionesRepository;

    public JList<HistorialReparacionesEntity> getByTipoReparacion(String tipo_reparacion)
    {return (JList<HistorialReparacionesEntity>) historialReparacionesRepository.findByTipoReparacion(tipo_reparacion);}

    public HistorialReparacionesEntity saveHistorial(HistorialReparacionesEntity historial)
    {return historialReparacionesRepository.save(historial);}
}