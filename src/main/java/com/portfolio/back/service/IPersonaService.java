package com.portfolio.back.service;

import com.portfolio.back.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> traerPersona();
    public void crearPersona (Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    
}
