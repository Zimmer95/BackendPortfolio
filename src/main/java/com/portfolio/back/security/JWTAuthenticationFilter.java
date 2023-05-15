package com.portfolio.back.security;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
  
   @Override
   public Authentication attemptAuthentication(HttpServletRequest request,
                                               HttpServletResponse response
                                               ) throws AuthenticationException{

       AuthCredentials  authCredentials = new AuthCredentials();
       
       try{
          
           authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);
           
           
       }catch(IOException excep){   
       }
       
       UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
               
               authCredentials.getEmail(),
               authCredentials.getPassword(),
               Collections.emptyList()     
       );
       return getAuthenticationManager().authenticate(usernamePAT);
   }
   
   
   @Override
   protected void successfulAuthentication (HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult)
                                            throws IOException, ServletException{
       
       UserDetailsImpl userDetails = (UserDetailsImpl)authResult.getPrincipal();
       String token = TokenUtils.createToken(userDetails.getNombre(),
                                             userDetails.getUsername());
       
       // Agregar cabeceras CORS
       response.setHeader("Access-Control-Allow-Origin", "*");
       response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
       response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type, Accept");
       response.setHeader("Access-Control-Allow-Credentials", "true");
       
       response.addHeader("Authorization", "Bearer " + token);
       response.getWriter().flush();
       
    }
   

    
    
}

