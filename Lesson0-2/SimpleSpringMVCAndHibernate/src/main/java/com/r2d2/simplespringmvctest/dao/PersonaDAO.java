/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest.dao;

import com.r2d2.simplespringmvctest.entity.Persona;
import java.util.List;

/**
 *
 * @author Arturo
 */
public interface PersonaDAO {
    
    public List<Persona> readPersonas();
    public void insertPersona(Persona p);
    public Persona getPersona(int id);
    public void deletePersona(int id);
}
