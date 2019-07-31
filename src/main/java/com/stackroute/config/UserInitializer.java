package com.stackroute.config;



import org.springframework.web.servlet.support.*;
public class UserInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override  //informs about that it is overridden from superclass
    protected Class<?>[] getRootConfigClasses() {
        {return new Class[]{UserConfig.class};}
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
