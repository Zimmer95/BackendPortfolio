package com.portfolio.back.model;



import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombreEmpresa;
    private boolean esActual;
    private String descripcion;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "fecha_fin")
    private Date fechaFin;
    
   

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String nombreEmpresa, boolean esActual, String descripcion, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.esActual = esActual;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    
    
}
