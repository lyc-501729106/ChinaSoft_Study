package com.etc.flower.controller;

import com.etc.flower.entity.Flower;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Code;
import com.jspsmart.upload.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SmartServlet",urlPatterns = "/SmartServlet")
//@WebServlet("/SmartServlet")
public class SmartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //因为我们要实现上传图片的功能，所以需要使用SmartUpload对象
        SmartUpload smartUpload = new SmartUpload();
        //初始化设置
        smartUpload.initialize(this.getServletConfig(),request,response);
        //修改编码方式
        Code code = new Code();
        smartUpload.setCharset("UTF-8");
        //实现上传功能调用upload功能
        Request request1 = null ;
        try {
            smartUpload.upload();
            request1 = smartUpload.getRequest();
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        //因为上传功能不能使用request对象来进行页面数据的获取，所以我们需要创建上传的获取数据对象
        //获取页面非上传内容的数据
        String name = request1.getParameter("fname");
        String fprice = request1.getParameter("price");
        //转换单价的数据类型
        double price = 0.0;
        if (fprice != null && !fprice.equals("")){
            price = Double.parseDouble(fprice);
        }
        String type = request1.getParameter("ftype");
        String fcount = request1.getParameter("count");
        int count = 0 ;
        if (fcount != null && !fcount.equals("")){
            count = Integer.parseInt(fcount);
        }
        //获取到图片信息
        Files files = smartUpload.getFiles();
        File file = files.getFile(0);
        //将获取的图片进行上传存储，注意上传的路径为Tomcat对应的服务器端的访问路径
        try {
            file.saveAs("/images/product" + file.getFileName());
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        System.out.println("name:  "  + name);
        System.out.println("type:  "  +type);
        System.out.println("count:  "  +count);
        System.out.println("FileName:  "  +file.getFileName());
        Flower flower = new Flower(name,price,type,count);
        flower.setPic("images/" + file.getFileName());
        UserService us = new UserServiceImpl();
        try {
            us.upload(flower);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
