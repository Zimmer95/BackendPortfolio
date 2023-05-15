package com.portfolio.back.controller;


import com.portfolio.back.model.Educacion;
import com.portfolio.back.model.ExperienciaLaboral;
import com.portfolio.back.model.Persona;
import com.portfolio.back.model.TipoEducacion;
import com.portfolio.back.model.TipoEmpleo;
import com.portfolio.back.model.Usuario;
import com.portfolio.back.service.IEducacionService;
import com.portfolio.back.service.IExperienciaLabService;
import com.portfolio.back.service.IPersonaService;
import com.portfolio.back.service.ITipoEducacionService;
import com.portfolio.back.service.ITipoEmpleoService;
import com.portfolio.back.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class Controller {

    @Autowired
    private final IUsuarioService servUsuario;
    
    @PostMapping ("/nueva-usuario")
    public void crearUsuario (@RequestBody Usuario user){
        servUsuario.crearUsuario(user);
    }
     @DeleteMapping("/borrar-usuario/{id}")
    public void borrarUsuario(@PathVariable Long id){
        servUsuario.borrarUsuario(id);
    }
    @GetMapping("/ver-usuario")
    @ResponseBody
    public List<Usuario> verUsuario(){
        return servUsuario.traerUsuario();  
    }
    
    /*
        PERSONA
    */
    
    @Autowired
    private final IPersonaService servPersona;
    
    @PostMapping ("/nueva-persona")
    public void agregarPersona (@RequestBody Persona per){
        servPersona.crearPersona(per);
    }
    @GetMapping("/ver-persona")
    @ResponseBody
    public List<Persona> verPersona(){
        return servPersona.traerPersona();  
    }
    @DeleteMapping("/borrar-persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        servPersona.borrarPersona(id);
    }
   
    /*
        EDUCACION
    */
    
    @Autowired
    private final IEducacionService servEducacion;
    
    @PostMapping ("/nueva-educacion")
    public void crearEducacion (@RequestBody Educacion edu){
        servEducacion.crearEducacion(edu);
    }
    @GetMapping("/ver-educacion")
    @ResponseBody
    public List<Educacion> traerEducacion(){
        return servEducacion.traerEducacion();  
    }
    @DeleteMapping("/borrar-educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        servEducacion.borrarEducacion(id);
    }
    
     /*
        EXPERIENCIA LABORAL
    */
    
    @Autowired
    private final IExperienciaLabService servExperienciaLab;
    
    @PostMapping ("/nueva-experiencia-lab")
    public void crearExperienciaLab (@RequestBody ExperienciaLaboral expLab){
        servExperienciaLab.crearExperienciaLab(expLab);
    }
    @GetMapping("/ver-experiencia-lab")
    @ResponseBody
    public List<ExperienciaLaboral> traerExperienciaLab(){
        return servExperienciaLab.traerExperienciaLab();  
    }
    @DeleteMapping("/borrar-experiencia-lab/{id}")
    public void borrarExperienciaLab(@PathVariable Long id){
        servExperienciaLab.borrarExperienciaLab(id);
    }
    
    /*
        TIPO EMPLEO
    */
    
    @Autowired
    private final ITipoEmpleoService servTipoEmpleo;
    
    @PostMapping ("/nueva-tipo-empleo")
    public void crearTipoEmpleo (@RequestBody TipoEmpleo tipoEmp){
        servTipoEmpleo.crearTipoEmpleo(tipoEmp);
    }
    @GetMapping("/ver-tipo-empleo")
    @ResponseBody
    public List<TipoEmpleo> traerTipoEmpleo(){
        return servTipoEmpleo.traerTipoEmpleo();  
    }
    @DeleteMapping("/borrar-tipo-empleo/{id}")
    public void borrarTipoEmpleo(@PathVariable Long id){
        servTipoEmpleo.borrarTipoEmpleo(id);
    }
    
    /*
        TIPO EMPLEO
    */
    
    @Autowired
    private final ITipoEducacionService servTipoEducacion;
    
    @PostMapping ("/nueva-tipo-educacion")
    public void crearTipoEducacion (@RequestBody TipoEducacion tipoEdu){
        servTipoEducacion.crearTipoEducacion(tipoEdu);
    }
    @GetMapping("/ver-tipo-educacion")
    @ResponseBody
    public List<TipoEducacion> traerTipoEducacion(){
        return servTipoEducacion.traerTipoEducacion();  
    }
    @DeleteMapping("/borrar-tipo-educacion/{id}")
    public void borrarTipoEducacion(@PathVariable Long id){
        servTipoEducacion.borrarTipoEducacion(id);
    }
    
    
}

