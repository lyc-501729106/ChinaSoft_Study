package com.etc.myshop.controller;

import com.etc.myshop.entity.TShopcar;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.service.WarehouseService;
import com.etc.myshop.serviceImpl.WarehouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AddToCartServlet",urlPatterns = "/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String detail_id = request.getParameter("detail_id");
        HttpSession session = request.getSession();
        TUser tUser = (TUser) session.getAttribute("tuser");
        if (tUser == null){
            session.setAttribute("detail_id",detail_id);
            request.setAttribute("type", "car");
            //没有登录，跳转到登录页面
            request.getRequestDispatcher("login-register.jsp").forward(request,response);
        }else {
            if (detail_id == null && detail_id.equals("")){
                session.getAttribute("detail_id");
            }
            int detailid = 0 ;
            if (detail_id != null && !detail_id.equals("")){
                detailid = Integer.parseInt(detail_id);
            }
            WarehouseService ws = new WarehouseServiceImpl();
            try {
                System.out.println("添加addcart时的tUserid: " + tUser.getTuser_id() + " tuser: " + tUser.getUname());
                int no = ws.addCart(tUser,detailid);
                if (no == -1){
                    request.setAttribute("result","添加失败");
                    System.out.println("添加失败");
                }else if (no == 0){
                    request.setAttribute("result","已经添加过了");
                    System.out.println("已经添加过了");
                }else if (no >= 1){
                    request.setAttribute("result","添加成功");
                    System.out.println("添加成功");
                }
                //将需要显示在页面中的鲜花信息获取并进行存储
                List<TShopcar> tShopcarList = ws.getCar(tUser);
                request.setAttribute("cars",tShopcarList);
                for (TShopcar ts :
                        tShopcarList) {
                    System.out.println(ts.getTwarehouse().getPrice());
                }
                //跳转到购物车界面
                request.getRequestDispatcher("cart.jsp").forward(request,response);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
