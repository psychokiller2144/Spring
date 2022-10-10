/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest.service;

import com.r2d2.simplespringmvctest.entity.Persona;
import java.util.List;

/**
 *
 * @author Arturo
 */
public interface ServicioPersona {
     public List < Persona > getPersonas();
     public void agregarPersona(Persona p);
     public Persona obtenerPersona(int id);
     public void borrarPersona(int id);
}
