package com.etc.flower.controller;

import com.etc.flower.entity.Flower;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShowFlowerServlet",urlPatterns = "/ShowFlowerServlet")
public class ShowFlowerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService us = new UserServiceImpl();
        //因为我们要实现分页功能，所以在此需要定义四个变量：当前页page,上一页 up, 下一页 down ， 总页 allPage;
        String  p = request.getParameter("page");
        p =  p ==  null ? "1" : p ; //如果获取的值为null，则表示第一次进入到此页面，设置初始值为1
        //转换数据类型
        int page = Integer.parseInt(p);
        int up = page - 1;//上一页
        int down = page + 1;//下一页
        int allPage = 0;
        try {
            allPage = us.getPage(2); //参数需要注明每页显示多少条记录
            System.out.println("allPage: " + allPage);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //在跳转到main.jsp之前从数据库获取到所有的鲜花信息
        List<Flower> flowerList = null;
        try {
            //从浏览器获取到所有的Cookie
            Cookie[] cookies = request.getCookies();
            //当cookies不为空的时候，我们就可以遍历，查找是否有我们设置的cookie
            if (cookies != null){
                for (Cookie c :
                        cookies) {
                    if (c.equals("mycookie")){
                        //表示当前网站已经登录过，所以可以根据value的值得到用户名，密码以及角色信息
                        String cookievalue = c.getValue();
                        String[] cvalue = cookievalue.split("#"); //字符串分割
                        Tuser tuser = us.login(cvalue[0] , cvalue[1],cvalue[2]);
                        request.getSession().setAttribute("tuser",tuser);
                    }
                }
            }
            flowerList = us.getAll(page , 2);
            request.setAttribute("test","wocao");
            for (Flower f :
                    flowerList) {
                System.out.println("f.getFid():  " + f.getFid());
            }
            request.setAttribute("flowers",flowerList);
            //在跳转到页面之前我们需要将页面需要的当前页page,上一页 up , 下一页down
            request.setAttribute("page",page);
            request.setAttribute("up",up);
            request.setAttribute("down",down);
            request.setAttribute("allPage",allPage);

            //一下两种方式都可以遍历
//            request.getRequestDispatcher("main.jsp").forward(request,response); //用EL表达式来表示jsp的内容
            request.getRequestDispatcher("mainjava.jsp").forward(request,response); //用java代码来表示jsp里面的内容
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
        System.out.println("ShowFlowerServlet的doGet方法");

    }
}
