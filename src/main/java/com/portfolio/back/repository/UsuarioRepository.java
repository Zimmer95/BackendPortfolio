package com.portfolio.back.repository;

import com.portfolio.back.model.Usuario;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
    Optional<Usuario> findOneByemail(String email);
    
}
