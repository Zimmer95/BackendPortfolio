package com.portfolio.back.service;

import com.portfolio.back.model.Usuario;
import com.portfolio.back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository repoUsuario;
    
    @Override
    public void crearUsuario(Usuario user) {
        repoUsuario.save(user);
    }
    @Override
    public void borrarUsuario(Long id) {
        repoUsuario.deleteById(id);
    }
    @Override
    public List<Usuario> traerUsuario() {
        return repoUsuario.findAll( ) ;
    }
    
}
