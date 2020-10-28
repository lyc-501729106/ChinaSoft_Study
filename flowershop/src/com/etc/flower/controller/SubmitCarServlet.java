package com.etc.flower.controller;

import com.etc.flower.entity.Address;
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
import java.util.HashMap;
import java.util.Map;

@WebServlet("/SubmitCarServlet")
public class SubmitCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调到此servlet的目的是为了进入到checkout.html页面
        //获取到所选鲜花的id数组
        String[] ids = request.getParameterValues("choose");
        HttpSession session = request.getSession();
        //定义一个sum来存储总价钱
        session.setAttribute("ids",ids);
        double sum = 0 ;

        //因为需要将鲜花与购买数量相结合，所以将值存储到Map中
        //定义鲜花数量的map
        Map<String , Integer> cMap = new HashMap<>();
        //定义鲜花支付总额的map
        Map<String , Double> sumMap = new HashMap<>();

        for (String id :
                ids) {
            //得到总价

            double sumii = 0;
            //request.getParameter("sum" + id); 获取的是name还是id？？？
            String sumi = request.getParameter("sum" + id);
            if (sumi != null && !sumi.equals(""))
                sumii =  Double.parseDouble(sumi);
            sum += sumii;
            sumMap.put(id,sumii);
            //get到每一中鲜花的数量
            String count = request.getParameter("count"+id);
            int c = 0;
            if (count != null && !count.equals(""))
                c = Integer.parseInt(count);

            cMap.put(id , c);

        }
        //将计算的总价钱存储在request中
        request.setAttribute("sum",sum);
        session.setAttribute("sum",sum);//将总价钱存在session中 给checkoutServlet调用
        //因为在CheckoutServlet需要 cMap的值，所以需要将此值存储在session中
        session.setAttribute("countMap",cMap);
        session.setAttribute("sumMap",sumMap);//因为在CheckoutServlet需要
        UserService us = new UserServiceImpl();
        //获取session里的tuser!!
        Tuser tuser = (Tuser) request.getSession().getAttribute("tuser");
        try {
            Address address = us.getAddress(tuser);
            System.out.println(address.getAddress());
            request.setAttribute("address",address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("checkout.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
