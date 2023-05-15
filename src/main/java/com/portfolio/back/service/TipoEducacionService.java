package com.portfolio.back.service;

import com.portfolio.back.model.TipoEducacion;
import com.portfolio.back.repository.TipoEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEducacionService implements ITipoEducacionService{
    
    @Autowired
    public TipoEducacionRepository repoTipoEducacion;
    
    @Override
    public List<TipoEducacion> traerTipoEducacion() {
        return repoTipoEducacion.findAll();
    }

    @Override
    public void crearTipoEducacion(TipoEducacion tipoEdu) {
        repoTipoEducacion.save(tipoEdu);
    }

    @Override
    public void borrarTipoEducacion(Long id) {
        repoTipoEducacion.deleteById(id);
    }

    @Override
    public TipoEducacion buscarTipoEducacion(Long id) {
        return repoTipoEducacion.findById(id).orElse(null);
    }
    
}
