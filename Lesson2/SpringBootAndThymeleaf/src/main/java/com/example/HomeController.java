package com.example;

import com.example.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model){
        
        String mensaje = "This is a message for our view";
        
        Persona persona = new Persona();
        persona.setNombre("Arturo");
        persona.setApellido("Escobar");
        persona.setEmail("mail@example.com");
        persona.setTelefono("2224578614");
        
        
        Persona persona1 = new Persona();
        persona1.setNombre("Laura");
        persona1.setApellido("Diaz");
        persona1.setEmail("laud@example.com");
        persona1.setTelefono("1245794531");
        
        
        Persona persona2 = new Persona();
        persona2.setNombre("Jorge");
        persona2.setApellido("Ramirez");
        persona2.setEmail("jorr@example.com");
        persona2.setTelefono("4579461254");
        
        
        Persona persona3 = new Persona();
        persona3.setNombre("Jessica");
        persona3.setApellido("Conde");
        persona3.setEmail("jesc@example.com");
        persona3.setTelefono("4541112478");
        
        List <Persona> personas = Arrays.asList(persona,persona1,persona2,persona3);
        //List <Persona> personas = new ArrayList<>();
        log.info("executing a MVC-controller");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
