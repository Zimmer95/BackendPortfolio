package com.portfolio.back.service;


import com.portfolio.back.model.ExperienciaLaboral;
import com.portfolio.back.repository.ExperienciaLabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLabService implements IExperienciaLabService{
    
    @Autowired
    public ExperienciaLabRepository repoExperienciaLab;
    
    @Override
    public List<ExperienciaLaboral> traerExperienciaLab() {
        return repoExperienciaLab.findAll();
    }

    @Override
    public void crearExperienciaLab(ExperienciaLaboral expLab) {
        repoExperienciaLab.save(expLab);
    }

    @Override
    public void borrarExperienciaLab(Long id) {
        repoExperienciaLab.deleteById(id);
    }

    @Override
    public ExperienciaLaboral buscarExperienciaLab(Long id) {
        return repoExperienciaLab.findById(id).orElse(null);
    }
}
