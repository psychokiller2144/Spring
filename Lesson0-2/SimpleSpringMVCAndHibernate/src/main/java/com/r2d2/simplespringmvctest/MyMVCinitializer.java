/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Arturo
 */
public class MyMVCinitializer {//implements WebApplicationInitializer{
        
        /*
    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        
        //System.out.println("LO ESTA DETECTANTO PERRO!!!");
        
        //XmlWebApplicationContext webAppContext = new XmlWebApplicationContext();
        //webAppContext.setConfigLocation("classpath:applicationContext.xml");
        AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
        webAppContext.register(MyAppConf.class);
        
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);
        
        ServletRegistration.Dynamic r2d2DispatcherServlet = sc.addServlet("r2d2Servlet", dispatcherServlet);
        
        r2d2DispatcherServlet.setLoadOnStartup(1);
        r2d2DispatcherServlet.addMapping("/r2d2.com/*");
        
        
    }*/
    
}
