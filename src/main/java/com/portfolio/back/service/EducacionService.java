package com.portfolio.back.service;

import com.portfolio.back.model.Educacion;
import com.portfolio.back.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository repoEducacion;
    
    @Override
    public List<Educacion> traerEducacion() {
        return repoEducacion.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        repoEducacion.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        repoEducacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return repoEducacion.findById(id).orElse(null);
    }
    
    
}
