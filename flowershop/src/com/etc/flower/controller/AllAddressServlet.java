package com.etc.flower.controller;

import com.etc.flower.entity.Address;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AllAddressServlet")
public class AllAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("checkout.jsp -> alladdressservlet post 跳转成功");
        UserService us = new UserServiceImpl();
        Tuser tuser = (Tuser) request.getSession().getAttribute("tuser");
        List<Address> addressList = null;
        try {
            addressList = us.addressList(tuser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Address a :
                addressList) {
            System.out.println("aid:  " + a.getAid());
        }
        request.setAttribute("addressList",addressList);
        request.getRequestDispatcher("checkout.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
