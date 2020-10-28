package com.etc.myshop.controller;

import com.etc.myshop.entity.TUser;
import com.etc.myshop.service.UserService;
import com.etc.myshop.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UserServlet",urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        UserService us = new UserServiceImpl();
        try {
            TUser tUser = us.login(uname , pwd);
            if (tUser == null){
                request.getRequestDispatcher("login-register.jsp").forward(request,response);
            }else {
                //登录成功，
                HttpSession session = request.getSession(); //定义session对象
                session.setAttribute("tuser",tUser);//使用session对象
                request.getRequestDispatcher("ShowAllServlet").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("UserServlet get!");
        HttpSession session = request.getSession();
        session.getAttribute("tuser");
    }
}
