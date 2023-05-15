package com.portfolio.back.service;
import com.portfolio.back.model.Educacion;

import java.util.List;

public interface IEducacionService {
    public List<Educacion> traerEducacion();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
}
