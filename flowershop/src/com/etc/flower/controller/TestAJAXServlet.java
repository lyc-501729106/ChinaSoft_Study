package com.etc.flower.controller;

import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Code;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/TestAJAXServlet")
public class TestAJAXServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Code code = new Code();
        System.out.println("checkout.jsp -> TestAJAXServlet post ");
        String city1 = request.getParameter("city");
        String city = code.Utf8(city1);
        System.out.println(code.Utf8(city1) + "\n");
        UserService us = new UserServiceImpl();
        PrintWriter out = response.getWriter();
        boolean flag = false;
        if (city != null && !city.equals("")){
            try {
                flag = us.ajaxCity(city);
                System.out.println("TestAJAXServlet flag : " + flag);
                if (flag){
                    out.print(1);
                    System.out.println("1");
                }else {
                    out.print(0);
                    System.out.println("0");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            out.print(-1);
            System.out.println("-1");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
