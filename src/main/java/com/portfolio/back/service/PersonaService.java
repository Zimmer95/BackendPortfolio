package com.portfolio.back.service;

import com.portfolio.back.model.Persona;
import com.portfolio.back.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository repoPersona;
    
    @Override
    public List<Persona> traerPersona() {
        return repoPersona.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        repoPersona.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        repoPersona.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return repoPersona.findById(id).orElse(null);
    }
    
}
