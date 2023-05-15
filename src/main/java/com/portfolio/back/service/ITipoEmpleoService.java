package com.portfolio.back.service;

import com.portfolio.back.model.TipoEmpleo;
import java.util.List;

public interface ITipoEmpleoService {
    
    public List<TipoEmpleo> traerTipoEmpleo();
    public void crearTipoEmpleo (TipoEmpleo tipoEmp);
    public void borrarTipoEmpleo (Long id);
    public TipoEmpleo buscarTipoEmpleo (Long id);
      
    
}
