/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest.service;

import com.r2d2.simplespringmvctest.dao.PersonaDAO;
import com.r2d2.simplespringmvctest.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arturo
 */
@Service
public class ServicioPersonaImpl implements ServicioPersona {
    
    @Autowired
    PersonaDAO personaDao;

    @Override
    @Transactional( readOnly=true )
    public List<Persona> getPersonas() {
        
        return (List<Persona>) personaDao.readPersonas();
    }

    @Override
    @Transactional
    public void agregarPersona(Persona p) {
        personaDao.insertPersona(p);
    }

    @Override
    @Transactional( readOnly=true )
    public Persona obtenerPersona(int id) {
        return personaDao.getPersona(id);
    }

    @Override
    @Transactional
    public void borrarPersona(int id) {
        personaDao.deletePersona(id);
    }
    
    
    
    
}
