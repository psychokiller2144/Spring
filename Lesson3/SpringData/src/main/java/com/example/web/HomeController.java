package com.example.web;

import com.example.dao.PersonaDao;
import com.example.domain.Persona;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    
    @Autowired
    private PersonaDao personaDao;
    
    @GetMapping("/")
    public String home(Model model){
        
        Iterable <Persona> personas =  personaDao.findAll();
                
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
