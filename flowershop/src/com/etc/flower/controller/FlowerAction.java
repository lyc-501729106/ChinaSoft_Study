package com.etc.flower.controller;

import com.etc.flower.entity.Flower;
import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

/**
 * @Author 吕译辰
 * @Date 2020/10/29 - 15:21
 */
@Controller
public class FlowerAction {
    //登录
    @RequestMapping("/login")
    public String log(){
        return null;
    }

    //添加到购物车
    @RequestMapping("/addcar")
    public String addcar(HttpServletRequest request){
        String str = null;
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
//            request.getRequestDispatcher("login.jsp").forward(request,response);
            str = "login.jsp";

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
//                request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
                str = "shoppingcart.jsp";
            } catch (SQLException e) {
                Log.mylog.debug(e.getMessage());
                e.printStackTrace();
            }
        }

        return str;
    }
    //显示鲜花详细信息
    @RequestMapping("/detail")
    public  String Detail(HttpServletRequest request){
        //获取到当前鲜花的ID值
        String fid = request.getParameter("fid");
        //数据库中fid 为int,而service中方法的参数也为int , 所以需要转换数据类型
        System.out.println("Detail fid:" + fid);
        int flowerid = 0 ;
        if (fid != null && !fid.equals("")){
            flowerid = Integer.parseInt(fid);
        }
        UserServiceImpl us = new UserServiceImpl();
        Flower flower = null;
        try {
            flower = us.getOne(flowerid);
            request.setAttribute("flower",flower);
//            request.getRequestDispatcher("productdetail.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(flower.getFlowername());
        return "productdetail.jsp";
    }
    //显示所有鲜花信息
    @RequestMapping("/show")
    public String showAll(HttpServletRequest request) {
        UserService us = new UserServiceImpl();
        //因为我们要实现分页功能，所以在此需要定义四个变量：当前页page,上一页 up, 下一页 down ， 总页 allPage;
        String p = request.getParameter("page");
        p = p == null ? "1" : p; //如果获取的值为null，则表示第一次进入到此页面，设置初始值为1
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
            if (cookies != null) {
                for (Cookie c :
                        cookies) {
                    if (c.equals("mycookie")) {
                        //表示当前网站已经登录过，所以可以根据value的值得到用户名，密码以及角色信息
                        String cookievalue = c.getValue();
                        String[] cvalue = cookievalue.split("#"); //字符串分割
                        Tuser tuser = us.login(cvalue[0], cvalue[1], cvalue[2]);
                        request.getSession().setAttribute("tuser", tuser);
                    }
                }
            }
            flowerList = us.getAll(page, 2);
            request.setAttribute("test", "wocao");
            for (Flower f :
                    flowerList) {
                System.out.println("f.getFid():  " + f.getFid());
            }
            request.setAttribute("flowers", flowerList);
            //在跳转到页面之前我们需要将页面需要的当前页page,上一页 up , 下一页down
            request.setAttribute("page", page);
            request.setAttribute("up", up);
            request.setAttribute("down", down);
            request.setAttribute("allPage", allPage);

            //一下两种方式都可以遍历
//            request.getRequestDispatcher("main.jsp").forward(request,response); //用EL表达式来表示jsp的内容
//            request.getRequestDispatcher("mainjava.jsp").forward(request,response); //用java代码来表示jsp里面的内容
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "mainjava.jsp";
    }
}
