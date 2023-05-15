package com.portfolio.back.service;

import com.portfolio.back.model.TipoEmpleo;
import com.portfolio.back.repository.TipoEmpleoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleoService implements ITipoEmpleoService{
        
    @Autowired
    public TipoEmpleoRepository repoTipoEmpleo;
    
    @Override
    public List<TipoEmpleo> traerTipoEmpleo() {
        return repoTipoEmpleo.findAll();
    }

    @Override
    public void crearTipoEmpleo(TipoEmpleo tipoEmp) {
        repoTipoEmpleo.save(tipoEmp);
    }

    @Override
    public void borrarTipoEmpleo(Long id) {
        repoTipoEmpleo.deleteById(id);
    }

    @Override
    public TipoEmpleo buscarTipoEmpleo(Long id) {
        return repoTipoEmpleo.findById(id).orElse(null);
    }
}
