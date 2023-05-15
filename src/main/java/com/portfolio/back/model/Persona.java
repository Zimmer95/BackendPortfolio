
package com.portfolio.back.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
  
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String sobre_mi;
    
    public Persona() {
    }

    public Persona(Long id, String dni, String nombre, String apellido, String telefono, String email, String sobre_mi) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.sobre_mi = sobre_mi;
    }
    
    

 
    
}
