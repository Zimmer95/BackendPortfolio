
package com.portfolio.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEducacion {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreTipoEducacion;

    public TipoEducacion() {
    }

    public TipoEducacion(Long id, String nombreTipoEducacion) {
        this.id = id;
        this.nombreTipoEducacion = nombreTipoEducacion;
    }
    
    
}
