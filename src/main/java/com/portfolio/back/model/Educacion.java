package com.portfolio.back.model;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre;
    private boolean esActual;
    
 
    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
  
    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    public Educacion() {
    }

    public Educacion(Long id, String nombre, boolean esActual, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.esActual = esActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    
    
    
}
