/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest.controller;


import com.r2d2.simplespringmvctest.entity.Persona;
import com.r2d2.simplespringmvctest.service.ServicioPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Arturo
 */
@Controller
public class MyController {

    @Autowired
    private ServicioPersona servicioPersona;

    @GetMapping("/listado")
    public String sayHello(Model model) {

        List<Persona> personas = servicioPersona.getPersonas();
        model.addAttribute("personas", personas);

        return "listado";
    }
    
    @GetMapping("/agregar")
    public String mostrarFormulario(Model model){
        
        //bind datos Persona
        Persona p = new Persona();
        model.addAttribute("persona", p);
        
        return "agregarPersona";
    }
    
    @PostMapping("/agregarPersona")
    public String agregarPersona(@ModelAttribute("persona") Persona p){
        //agregar cliente
        servicioPersona.agregarPersona(p);
        return "redirect:/r2d2/listado";
    }
    
    @GetMapping("/modificar")
    public String editarPersona(@RequestParam("idPersona")int id, Model model  ){
        Persona p = servicioPersona.obtenerPersona(id);
        model.addAttribute("persona", p);
        return "agregarPersona";
    }
    
    @GetMapping("/eliminar")
    public String eliminarPersona(@RequestParam("idPersona")int id){
        servicioPersona.borrarPersona(id);
        return "redirect:/r2d2/listado";
    }
    
}
