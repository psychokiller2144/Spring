/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest.dao;

import com.r2d2.simplespringmvctest.entity.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arturo
 */
@Repository
public class PersonaDAOImp implements PersonaDAO {

   // private EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernatePU");
    //private EntityManager em = emf.createEntityManager();
    
    @Autowired
    private SessionFactory sessionFactory;

    
    @Override
    public List<Persona> readPersonas() {
        
        Session session = sessionFactory.getCurrentSession();
        
        Query<Persona> query = session.createQuery("from Persona", Persona.class);
        
       // String hql = "SELECT p FROM Persona p";
       // javax.persistence.Query query = em.createQuery(hql);
        
        List<Persona> personas = query.getResultList();
        return personas;
    }

    @Override
    public void insertPersona(Persona p) {
        Session session = sessionFactory.getCurrentSession();
        //esto solo hace un simple insert into
        //session.save(p);
        
        //esto es lo que necesitamos
        session.saveOrUpdate(p);
        
    }

    @Override
    public Persona getPersona(int id) {
        Session session = sessionFactory.getCurrentSession();
        Persona p = session.get(Persona.class, id);
        return p;
    }

    @Override
    public void deletePersona(int id) {
        Session session = sessionFactory.getCurrentSession();
        
        Query query = session.createQuery("delete from Persona where id=:idCliente");
        query.setParameter("idCliente", id);
        query.executeUpdate();
    }
    
    

}
