package com.etc.myshop.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/SubmitCarServlet",name = "SubmitCarServlet")
public class SubmitCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids = request.getParameterValues("choose");
        //定义一个sum来存储总价钱
        double sum = 0 ;
        for (String id :
                ids) {
            //得到总价
            double sumii = 0;
            System.out.println("id ::" + id);
            String sumi = request.getParameter("sum" + id);
            System.out.println("sumi: " + sumi);
            if (sumi != null && !sumi.equals(""))
                sumii =  Double.parseDouble(sumi);
            sum += sumii;
            System.out.println("sumii:  " + sumii);
        }
        //将计算的总价钱存储在request中
        request.setAttribute("sum",sum);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
