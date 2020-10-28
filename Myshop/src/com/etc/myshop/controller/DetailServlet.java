package com.etc.myshop.controller;

import com.etc.myshop.entity.Detail;
import com.etc.myshop.service.WarehouseService;
import com.etc.myshop.serviceImpl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "detailServlet",urlPatterns = "/detailServlet")
public class DetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String detail = request.getParameter("wid");
        System.out.println("detailServlet detail :" + detail);
        int detail_id = 0;
        if (detail != null && !detail.equals("")){
            detail_id = Integer.parseInt(detail);
        }
        WarehouseService ws = new WarehouseServiceImpl();
        Detail detail1 = null;
        try {
            detail1 = ws.getOne(detail_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("detail" , detail1);
        request.getRequestDispatcher("single-product.jsp").forward(request,response);

    }
}
