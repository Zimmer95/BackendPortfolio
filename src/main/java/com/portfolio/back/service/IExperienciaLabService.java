package com.portfolio.back.service;

import com.portfolio.back.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLabService {
    
    public List<ExperienciaLaboral> traerExperienciaLab();
    public void crearExperienciaLab (ExperienciaLaboral expLab);
    public void borrarExperienciaLab (Long id);
    public ExperienciaLaboral buscarExperienciaLab(Long id);
    
}
