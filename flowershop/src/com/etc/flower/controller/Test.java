package com.etc.flower.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testServlet")
public class Test extends HttpServlet {
    public Test(){
        System.out.println("我是构造方法");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget方法");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("写了一句话");
        out.println("</body>");
        out.println("</html>");
        this.doPost(req, resp);//在doGet当中调用doPost方法
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是Test的doPost方法");
        //post请求乱码处理
        req.setCharacterEncoding("utf-8");
        //post响应乱码处理方式
        resp.setCharacterEncoding("utf-8");

        String[] hobbys = req.getParameterValues("hobby");
        for (String hobby :
                hobbys) {
            System.out.println(hobby);
        }
        System.out.println("tt ::" + req.getSession().getAttribute("tt").toString());
        //请求转发 地址栏不会变
        req.getRequestDispatcher("login.jsp").forward(req,resp);
        //重定向 地址栏会跟着改变
//        resp.sendRedirect("login.jsp");


    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
