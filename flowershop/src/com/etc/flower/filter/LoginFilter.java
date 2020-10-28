package com.etc.flower.filter;

import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//@WebFilter(filterName = "LoginFilter",urlPatterns = "/shoppingcart.jsp")
public class LoginFilter implements javax.servlet.Filter {
    public void destroy() {
        System.out.println("destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        if (tuser != null){
            UserService us = new UserServiceImpl();
            List<ShopCar> shopCarList = null;
            try {
                shopCarList = us.getCar(tuser);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.setAttribute("cars",shopCarList);
            request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
            chain.doFilter(request, response);
        }else {
            request.getRequestDispatcher("tuserServ").forward(request,response);
        }

    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("init-");
    }

}
