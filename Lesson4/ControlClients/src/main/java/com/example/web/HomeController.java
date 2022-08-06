package com.example.web;

import com.example.domain.Persona;
import com.example.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String home(Model model){
        
        Iterable <Persona> personas =  personaService.listarPersonas();
                
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
