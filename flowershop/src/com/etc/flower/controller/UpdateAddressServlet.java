package com.etc.flower.controller;

import com.etc.flower.entity.Address;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Code;
import com.sun.org.apache.xerces.internal.impl.xs.XSElementDecl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UpdateAddressServlet" , urlPatterns = "/UpdateAddressServlet")
public class UpdateAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //更新地址
        System.out.println("checkout.jsp -> updateAddressServlet post 跳转成功！");
        String aid = request.getParameter("aaid");
        System.out.println("updateAdd aid :  "+aid);
        String phone = request.getParameter("phone");
        System.out.println("updateAdd phone :  "+phone);
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String address1 = request.getParameter("address");
        Address address = new Address();
        Code code = new Code();
        address.setAid(Integer.parseInt(aid));
        address.setPhone(code.Utf8(phone));
        address.setEmail(code.Utf8(email));
        address.setCountry(code.Utf8(country));
        address.setCity(code.Utf8(city));
        address.setAddress(code.Utf8(address1));
        Tuser tuser = (Tuser) request.getSession().getAttribute("tuser");
        UserService us = new UserServiceImpl();
        try {
            int no = us.updataAddress(tuser,address);
            if (no == 1){
                System.out.println("修改成功！");
                request.setAttribute("msg1","修改成功");
            }else {
                System.out.println("修改失败!");
                request.setAttribute("msg1","修改失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("checkout.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设为默认地址
        System.out.println("checkout.jsp -> updateAddressServlet get 跳转成功！");
        String aid = request.getParameter("aaid");
        System.out.println("updateAdd aid :  " + aid);
        UserService us = new UserServiceImpl();
        int no = 0;
        try {
            no = us.morenAddress(Integer.parseInt(aid));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (no == 1) {
            System.out.println("设为默认地址成功!");
            request.setAttribute("msg2", "设为默认地址成功!");
        } else {
            System.out.println("设为默认地址失败!");
            request.setAttribute("msg2", "设为默认地址失败!");
        }
        request.getRequestDispatcher("checkout.jsp").forward(request, response);
    }
}
