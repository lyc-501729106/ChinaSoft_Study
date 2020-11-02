package com.etc.flower.controller;

import com.etc.flower.entity.Forder;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/1 - 17:25
 */
@Controller
public class BackAction {
    //上传
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam("fname") String fname, @RequestParam("price") double price, @RequestParam("pic") MultipartFile pic) throws IOException {
        System.out.println(fname);
        System.out.println(price);
        System.out.println(pic.getOriginalFilename());
        pic.transferTo(new File("D:\\IdeaProjects\\Test\\flowershop\\web\\images\\" + pic.getOriginalFilename()));
        System.out.println("D:\\IdeaProjects\\Test\\flowershop\\web\\images\\" + pic.getOriginalFilename());
        return null;
    }

    //退出
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();//注销登录
//        request.getRequestDispatcher("index.jsp").forward(request,response);
//        return "index.jsp";
        //重定向！！
        return "redirect:show.action";
    }

    @RequestMapping(value = "/more", method = RequestMethod.POST)
    public String more(HttpServletRequest request) {
        System.out.println("MoreServlet Post 方法");
        String uname = request.getParameter("uname");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        //转换日期类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date s = null, e = null;
        if (start != null) {
            try {
                s = simpleDateFormat.parse(start);
                System.out.println("s :" + s);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }
        }
        if (end != null) {
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
        p = p == null ? "1" : p;
        int page1 = Integer.parseInt(p);
        int up1 = page1 - 1;
        int down1 = page1 + 1;
        int allpage1 = 0;

        Tuser tuser = new Tuser();
        UserService us = new UserServiceImpl();
        System.out.println("page1 : " + page1);
        List<Forder> list = null;
        try {
            list = us.getOrder(tuser, s, e, page1, 3);
            List<Forder> listPage = us.getOrderPage(tuser, s, e, 3);
            for (Forder f :
                    listPage) {
                allpage1 = f.getPage();
            }
            System.out.println("allpage1 == " + allpage1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        request.setAttribute("page1", page1);
        request.setAttribute("allpage1", allpage1);
        request.setAttribute("up1", up1);
        request.setAttribute("down1", down1);
        request.setAttribute("forder", list);
//        request.getRequestDispatcher("back.jsp").forward(request,response);
        return "back.jsp";
    }
}
