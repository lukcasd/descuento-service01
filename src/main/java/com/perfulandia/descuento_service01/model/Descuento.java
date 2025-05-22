package com.perfulandia.descuento_service01.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Descuento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombreDescuento;

    @Column(nullable = false)
    private String tipoDescuento; // Ej: Porcentaje o Monto fijo

    @Column(nullable = false)
    private double valor;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private boolean activo;

    private int condicionMinima; // Por ejemplo: compra mínima de X
    private int limiteUso;
}