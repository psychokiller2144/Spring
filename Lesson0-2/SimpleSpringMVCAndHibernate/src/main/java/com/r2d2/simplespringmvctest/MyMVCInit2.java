/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.r2d2.simplespringmvctest;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Arturo
 */
public class MyMVCInit2 extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {AppContext.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MyAppConf.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/r2d2/*"};
    }
    
}
