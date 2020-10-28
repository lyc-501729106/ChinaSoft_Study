package com.etc.flower.controller;

import com.etc.flower.entity.Forder;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "MoreServlet",urlPatterns = "/MoreServlet")
public class MoreServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MoreServlet Post 方法");
        String uname = request.getParameter("uname");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        //转换日期类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date s = null , e = null ;
        if (start != null) {
            try {
                s = simpleDateFormat.parse(start);
                System.out.println("s :" + s);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
        if (end != null){
            try {
                e = simpleDateFormat.parse(end);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
        /**
         * 分页功能
         */
        String p = request.getParameter("page1");
        p = p == null? "1" : p ;
        int page1 = Integer.parseInt(p);
        int up1 = page1 - 1;
        int down1 = page1 +1;
        int allpage1 = 0;

        Tuser tuser = new Tuser();
        UserService us = new UserServiceImpl();
        System.out.println("page1 : " + page1);
        List<Forder> list = null;
        try {
            list = us.getOrder(tuser,s,e,page1,3);
            List<Forder> listPage = us.getOrderPage(tuser,s,e,3);
            for (Forder f :
                    listPage) {
                allpage1 = f.getPage();
            }
            System.out.println("allpage1 == " + allpage1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        request.setAttribute("page1",page1);
        request.setAttribute("allpage1",allpage1);
        request.setAttribute("up1",up1);
        request.setAttribute("down1",down1);
        request.setAttribute("forder",list);
        request.getRequestDispatcher("back.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MoreServlet Get 方法");
        this.doPost(request, response);
    }
}
