package com.etc.flower.controller;

import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 * 结算功能的Servlet
 */
@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CheckoutServlet post");
        //获取已经登录的tuser 用session！！
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        //调用SubmitCarServlet中已经存在session中的总价钱
        double sum = (double) session.getAttribute("sum");
        //因为在SubmitCarServlet中已经将countMap存储在session中，所以直接获取么
        Map<String,Integer> countMap = (Map<String, Integer>) session.getAttribute("countMap");
        Map<String,Double> sumMap = (Map<String, Double>) session.getAttribute("sumMap");//在SubmitCarServlet中已经存了！！
        String[] ids = (String[]) session.getAttribute("ids");//来自SubmitCarServlet
        System.out.println("-------");
        System.out.println("tuser: " + tuser);
        System.out.println("sumMap: " + sumMap);
        System.out.println("countMap: " + countMap);
        System.out.println("sum: " + sum);
        UserService us = new UserServiceImpl();
        try {
            us.pay(tuser,sum,countMap,sumMap,ids);
        } catch (SQLException e) {
            System.out.println("账户余额不足！！");
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
