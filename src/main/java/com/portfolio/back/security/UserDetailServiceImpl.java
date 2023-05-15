
package com.portfolio.back.security;

import com.portfolio.back.model.Usuario;
import com.portfolio.back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    
    @Autowired
    public UsuarioRepository repoUsuario;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario =  repoUsuario
                            .findOneByemail(email)
                            .orElseThrow(()->new UsernameNotFoundException ("El usuario "
                             + email + " no se encuentra registrado"));
                            
    return new UserDetailsImpl(usuario);
       
    }

}
