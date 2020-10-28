package com.etc.flower.controller;

import com.etc.flower.entity.Address;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Code;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/OneAddressServlet")
/**
 * 获取一个地址
 */
public class OneAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("oneaddressser post");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("oneaddressser get");
        UserService us = new UserServiceImpl();
        String aid = request.getParameter("aid");
        System.out.println("aid: " + aid);
        Address address = null;
        try {
            //获取一个地址
            address = us.oneAddress(Integer.parseInt(aid));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("onaddre",address);
        request.getRequestDispatcher("checkout.jsp").forward(request,response);
    }
}
