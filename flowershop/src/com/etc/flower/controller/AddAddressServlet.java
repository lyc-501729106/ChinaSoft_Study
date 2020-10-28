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

@WebServlet("/AddAddressServlet")
public class AddAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        Code code = new Code();

        Address address1 = new Address();
        address1.setPhone(code.Utf8(phone));
        address1.setEmail(code.Utf8(email));
        address1.setCountry(code.Utf8(country));
        address1.setCity(code.Utf8(city));
        address1.setAddress(code.Utf8(address));
        UserService  us = new UserServiceImpl();
        Tuser tuser = (Tuser) request.getSession().getAttribute("tuser");
        int no = 0;
        try {
            no = us.addAddress(tuser , address1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (no == 1){
            System.out.println("添加地址成功");
            request.setAttribute("msg","添加地址成功");
        }else {
            System.out.println("添加地址失败");
            request.setAttribute("msg","添加地址失败");
        }
        request.getRequestDispatcher("checkout.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
