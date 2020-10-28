package com.etc.myshop.controller;

import com.etc.myshop.entity.TWarehouse;
import com.etc.myshop.service.WarehouseService;
import com.etc.myshop.serviceImpl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ShowAllServlet",urlPatterns = "/ShowAllServlet")
public class ShowAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ShowAllServlet post!");
        WarehouseService ws = new WarehouseServiceImpl();
        List<TWarehouse> warehouseList = null;
        try {
            warehouseList = ws.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (TWarehouse tw :
                warehouseList) {
            System.out.println(tw.getName());
        }
        request.setAttribute("warehouseList",warehouseList);
        request.getRequestDispatcher("shop-left-sidebar.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ShowAllServlet get!");
        this.doPost(request, response);
    }
}
