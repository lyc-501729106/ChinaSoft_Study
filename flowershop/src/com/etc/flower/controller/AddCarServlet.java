package com.etc.flower.controller;

import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Log;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/AddCarServlet")
public class AddCarServlet extends HttpServlet {
    public AddCarServlet(){
        System.out.println("这是AddCarServlet的构造方法");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dopost 方法");
        this.doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //想要添加到购物车，必须保证用户已经登录，所以先判断是否登录
        //因为用户登录成功后将用户信息存储到了session中，所以可以从中获取用户信息
        System.out.println("addcarservlet doget");
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        String fid = request.getParameter("fid");
        if (tuser != null) System.out.println(tuser.getTuserid());
        if (tuser == null){
            //希望登录成功之后依然希望添加到购物车中
            session.setAttribute("fid",fid);
            System.out.println("---");
            //传递一个标识，标识当前的位置为购物车的位置进入到登录页面的
            request.setAttribute("type", "car");
            System.out.println("---");
            //没有登录，跳转到登录页面
            request.getRequestDispatcher("login.jsp").forward(request,response);

        }else {
            if (fid == null || fid.equals("")){
                fid = (String)session.getAttribute("fid");
            }
            int flowerid = 0;
            if (fid != null && !fid.equals("")){
                flowerid = Integer.parseInt(fid);
            }
            System.out.println("Tuserid :" + tuser.getTuserid());
            System.out.println("addcarservlet flowerid " + flowerid);
            UserService us = new UserServiceImpl();
            try {
                int no = us.addCar(tuser,flowerid);
                if (no == 0){
                    request.setAttribute("result","添加失败");
                    System.out.println("添加失败");
                }else if(no == 1){
                    request.setAttribute("result","添加成功");
                    System.out.println("添加成功");
                }else if (no == 6){
                    request.setAttribute("result","已经添加过了");
                    System.out.println("已经添加过了");
                }
                //将需要显示在页面中的鲜花信息获取并进行存储
                List<ShopCar> shopCarList = us.getCar(tuser);
                request.setAttribute("cars",shopCarList);
                for (ShopCar sc :
                        shopCarList) {
                    System.out.println(sc.getFlower().getPrice());
                }
                //跳转到购物车界面
                request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
            } catch (SQLException e) {
                Log.mylog.debug(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
