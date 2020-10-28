package com.etc.flower.controller;


import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

//@WebServlet("/tuserServ")
public class TuserServlet extends javax.servlet.http.HttpServlet {
//    注解的方式和配置xml文档的方式，二者选其一，
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //获取页面的用户名和密码
        String uname = request.getParameter("userame");
        String pwd = request.getParameter("Password");
        String role = request.getParameter("role");
        System.out.println("role:" + role);
        //调用service 的login方法
        UserService us = new UserServiceImpl();
        try {
            Tuser tuser = us.login(uname , pwd,role);
            if (tuser == null){
                //登录失败,跳回登录页面
                request.setAttribute("result","请输入正确的用户名和密码");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }else{
                //登录成功后我们可以进行计数操作
                //因为此时计数是在统计已经登录的用户的数量，所以与请求，对话无关，应该与容器有关
                //所以我们首先要创建一个上下文对象
                ServletContext application = this.getServletContext();
                //读取count的值
                char count = (char) application.getAttribute("logincount");
                //如果以上的值为空，表示第一次登录，则需要将此值设置为1
                if ((count+"") == null) count = 1 ;
                //如果读取值不为空，将此值+1
                else count++;
                //最终我们都需要将此值存储到上下文中
                application.setAttribute("logincount",count);

                //登录成功后将登录成功的信息存储在Cookie中，这样在有效的时长内就可以做到自动登录
                //所以先创建一个Cookie对象
                Cookie cookie = new Cookie("mycookie", uname +"#" + pwd+"#"+role);
                //设置cookie时长
                cookie.setMaxAge(60*2); // 两分钟
                //将设置好的Cookie添加到浏览器端
                response.addCookie(cookie);

                //登录成功，跳转到main.html页面
                //为了在任何地方都获取到已登录的用户信息，我们可以将用户信息存储在session中
                HttpSession session = request.getSession();//定义session对象 ,
                session.setAttribute("tuser",tuser);//将用户信息存储在session中
                //当从购物车的位置登录成功后，要跳转到购物车页面
                //获取到type的值，决定要跳到那个页面
                String type = request.getParameter("type");
                if ("car".equals(type)){
                    request.getRequestDispatcher("AddCarServlet").forward(request,response);
                }else {
                    request.getRequestDispatcher("ShowFlowerServlet").forward(request,response);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
        System.out.println("我是UserServlet的doGet方法！");
        request.getRequestDispatcher("ShowFlowerServlet").forward(request,response);
    }

    @Override
    public void init() throws ServletException {
        String name = this.getInitParameter("name");
        System.out.println("name:" + name);
    }
}
