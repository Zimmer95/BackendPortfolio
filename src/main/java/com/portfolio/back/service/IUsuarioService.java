package com.portfolio.back.service;

import com.portfolio.back.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> traerUsuario();
    public void crearUsuario (Usuario user);
    public void borrarUsuario (Long id);

}
