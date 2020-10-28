package com.etc.flower.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.io.*;

@WebListener()
public class TestListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public TestListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        System.out.println("初始化上下文");
        String path = sce.getServletContext().getRealPath("/");
        File file = new File(path +"WEB-INF\\loginCount.txt");
        if (file!= null){
            FileInputStream fin = null;
            int len = 0 ;
            try {
                fin = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                len =  fin.read();
                System.out.println("len : " + (char)len);
                ServletContext application = sce.getServletContext();
                application.setAttribute("logincount" , (char)len);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        System.out.println("销毁上下文");
        String path = sce.getServletContext().getRealPath("/");
        File file = new File(path +"WEB-INF\\loginCount.txt");
        ServletContext application = sce.getServletContext();
        char logincount = (char) application.getAttribute("logincount");
        String str = logincount + "";
        System.out.println("logincount: " +logincount);
        FileOutputStream fout = null ;
        try {
            fout = new FileOutputStream(file);
            fout.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.flush();
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        System.out.println("产生session");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        System.out.println("销毁session");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
        System.out.println("添加属性了");
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
        System.out.println("删除属性了");
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attribute
         is replaced in a session.
      */
        System.out.println("替换属性了");
    }
}
