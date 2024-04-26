package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Data

@NoArgsConstructor
@AllArgsConstructor
public class ReporteCuatroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reporteCuatro")
    private List<HistorialReparacionesEntity> tipo_reparacion = new ArrayList<>();
    private String tipo_motor;
    private int monto_total;

}
