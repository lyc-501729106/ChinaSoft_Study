package com.etc.flower.controller;

import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ClearCartServlet",urlPatterns = "/ClearCartServlet")
public class ClearCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ClearCartServlet doGet 方法");
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        UserService us = new UserServiceImpl();
        try {
            us.clearCart(tuser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
    }
}
