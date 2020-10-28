package com.etc.flower.controller;

import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "DeleteOneServlet",urlPatterns = "/DeleteOneServlet")
public class DeleteOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DeleteOneSevlet doGet 方法");
        String sid = request.getParameter("sid");
        UserService us = new UserServiceImpl();
        try {
            us.deleteOne(Integer.parseInt(sid));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        List<ShopCar> shopCarList = null;
        try {
            shopCarList = us.getCar(tuser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("cars",shopCarList);
        request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
    }
}
