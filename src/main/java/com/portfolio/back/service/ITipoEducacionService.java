package com.portfolio.back.service;

import com.portfolio.back.model.TipoEducacion;
import java.util.List;


public interface ITipoEducacionService {
    
    public List<TipoEducacion> traerTipoEducacion();
    public void crearTipoEducacion (TipoEducacion tipoEdu);
    public void borrarTipoEducacion (Long id);
    public TipoEducacion buscarTipoEducacion (Long id);
}
