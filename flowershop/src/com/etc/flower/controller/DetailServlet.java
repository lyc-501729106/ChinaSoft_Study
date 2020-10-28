package com.etc.flower.controller;

import com.etc.flower.entity.Flower;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到当前鲜花的ID值
        String fid = request.getParameter("fid");
        //数据库中fid 为int,而service中方法的参数也为int , 所以需要转换数据类型
        System.out.println("Detail fid:" + fid);
        int flowerid = 0 ;
        if (fid != null && !fid.equals("")){
            flowerid = Integer.parseInt(fid);
        }
        UserServiceImpl us = new UserServiceImpl();
        Flower flower = null;
        try {
            flower = us.getOne(flowerid);
            request.setAttribute("flower",flower);
            request.getRequestDispatcher("productdetail.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(flower.getFlowername());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
