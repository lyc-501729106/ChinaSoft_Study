package com.etc.flower.controller;

import com.etc.flower.entity.Address;
import com.etc.flower.entity.Flower;
import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;
import com.etc.flower.service.UserService;
import com.etc.flower.serviceImpl.UserServiceImpl;
import com.etc.flower.util.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @Author 吕译辰
 * @Date 2020/10/29 - 15:21
 */
@Controller
public class FlowerAction {

    //在页面中点击任何想要跳转到页面的时候，都需要先进入到controller然后才能页面跳转
    //因为所有的页面都放在了webinfo 下，即浏览器端无法直接访问，只能通过视图解析器
    //所以会导致我们写了很多的页面跳转方法，为了简化代码 ，我们可以只写一个方法，根据页面的标识不同，来进行跳转
    @RequestMapping("/go")
    public String goForward(String go) {
        /*String result = "";
        if ("back".equals(go)){
            result = "back.jsp";
        }*/
        return go;
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    //结算
    public String checkout(HttpServletRequest request) {
        System.out.println("CheckoutServlet post");
        //获取已经登录的tuser 用session！！
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        //调用SubmitCarServlet中已经存在session中的总价钱
        double sum = (double) session.getAttribute("sum");
        //因为在SubmitCarServlet中已经将countMap存储在session中，所以直接获取么
        Map<String, Integer> countMap = (Map<String, Integer>) session.getAttribute("countMap");
        Map<String, Double> sumMap = (Map<String, Double>) session.getAttribute("sumMap");//在SubmitCarServlet中已经存了！！
        String[] ids = (String[]) session.getAttribute("ids");//来自SubmitCarServlet
        System.out.println("-------");
        System.out.println("tuser: " + tuser);
        System.out.println("sumMap: " + sumMap);
        System.out.println("countMap: " + countMap);
        System.out.println("sum: " + sum);
        UserService us = new UserServiceImpl();
        try {
            us.pay(tuser, sum, countMap, sumMap, ids);
        } catch (SQLException e) {
            System.out.println("账户余额不足！！");
            e.printStackTrace();
        }
        //传一个参数，result 参数
        return "forward:show.action?result='结算成功'";
    }

    //提交购物车信息
    @RequestMapping(value = "/subCar", method = RequestMethod.POST)
    public String subCar(HttpServletRequest request) {
        //调到此servlet的目的是为了进入到checkout.html页面
        //获取到所选鲜花的id数组
        String[] ids = request.getParameterValues("choose");
        HttpSession session = request.getSession();
        //定义一个sum来存储总价钱
        session.setAttribute("ids", ids);
        double sum = 0;

        //因为需要将鲜花与购买数量相结合，所以将值存储到Map中
        //定义鲜花数量的map
        Map<String, Integer> cMap = new HashMap<>();
        //定义鲜花支付总额的map
        Map<String, Double> sumMap = new HashMap<>();

        for (String id :
                ids) {
            //得到总价

            double sumii = 0;
            //request.getParameter("sum" + id); 获取的是name还是id？？？
            String sumi = request.getParameter("sum" + id);
            if (sumi != null && !sumi.equals(""))
                sumii = Double.parseDouble(sumi);
            sum += sumii;
            sumMap.put(id, sumii);
            //get到每一中鲜花的数量
            String count = request.getParameter("count" + id);
            int c = 0;
            if (count != null && !count.equals(""))
                c = Integer.parseInt(count);

            cMap.put(id, c);

        }
        //将计算的总价钱存储在request中
        request.setAttribute("sum", sum);
        session.setAttribute("sum", sum);//将总价钱存在session中 给checkoutServlet调用
        //因为在CheckoutServlet需要 cMap的值，所以需要将此值存储在session中
        session.setAttribute("countMap", cMap);
        session.setAttribute("sumMap", sumMap);//因为在CheckoutServlet需要
        UserService us = new UserServiceImpl();
        //获取session里的tuser!!
        Tuser tuser = (Tuser) request.getSession().getAttribute("tuser");
        try {
            Address address = us.getAddress(tuser);
            System.out.println(address.getAddress());
            request.setAttribute("address", address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        request.getRequestDispatcher("checkout.jsp").forward(request,response);
        return "checkout.jsp";

    }

    //登录
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        //获取页面的用户名和密码
        String result = "";
        String uname = request.getParameter("username");
        String pwd = request.getParameter("Password");
        String role = request.getParameter("role");
        System.out.println("role:" + role);
        //调用service 的login方法
        UserService us = new UserServiceImpl();
        try {
            Tuser tuser = us.login(uname, pwd, role);
            if (tuser == null) {
                //登录失败,跳回登录页面
                request.setAttribute("result", "请输入正确的用户名和密码");
                result = "login.jsp";
//                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                //登录成功后我们可以进行计数操作
                //因为此时计数是在统计已经登录的用户的数量，所以与请求，对话无关，应该与容器有关
                //所以我们首先要创建一个上下文对象
//                ServletContext application = this.getServletContext();
                //读取count的值
//                char count = (char) application.getAttribute("logincount");
                //如果以上的值为空，表示第一次登录，则需要将此值设置为1
//                if ((count + "") == null) count = 1;
//                    //如果读取值不为空，将此值+1
//                else count++;
//                //最终我们都需要将此值存储到上下文中
//                application.setAttribute("logincount", count);

                //登录成功后将登录成功的信息存储在Cookie中，这样在有效的时长内就可以做到自动登录
                //所以先创建一个Cookie对象
                Cookie cookie = new Cookie("mycookie", uname + "#" + pwd + "#" + role);
                //设置cookie时长
                cookie.setMaxAge(60 * 2); // 两分钟
                //将设置好的Cookie添加到浏览器端
                response.addCookie(cookie);

                //登录成功，跳转到main.html页面
                //为了在任何地方都获取到已登录的用户信息，我们可以将用户信息存储在session中
                HttpSession session = request.getSession();//定义session对象 ,
                session.setAttribute("tuser", tuser);//将用户信息存储在session中
                //当从购物车的位置登录成功后，要跳转到购物车页面
                //获取到type的值，决定要跳到那个页面
                String type = request.getParameter("type");
                System.out.println("type : " + type);
                if ("car".equals(type)) {
//                    request.getRequestDispatcher("AddCarServlet").forward(request, response);
                    //forward 相当于跳转到servlet 注意没有空格！！！ get 是可以跳转到post 的！ 任意跳！
                    result = "forward:addCar.action";
                } else {
//                    request.getRequestDispatcher("ShowFlowerServlet").forward(request, response);
                    result = "forward:show.action";
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    //添加到购物车
    @RequestMapping("/addCar")
    public String addcar(HttpServletRequest request) {
        String result = null;
        //想要添加到购物车，必须保证用户已经登录，所以先判断是否登录
        //因为用户登录成功后将用户信息存储到了session中，所以可以从中获取用户信息
        System.out.println("addcarservlet doget");
        HttpSession session = request.getSession();
        Tuser tuser = (Tuser) session.getAttribute("tuser");
        String fid = request.getParameter("fid");
        if (tuser != null) System.out.println(tuser.getTuserid());
        if (tuser == null) {
            //希望登录成功之后依然希望添加到购物车中
            session.setAttribute("fid", fid);
            System.out.println("---");
            //传递一个标识，标识当前的位置为购物车的位置进入到登录页面的
            request.setAttribute("type", "car");
            System.out.println("---");
            //没有登录，跳转到登录页面
//            request.getRequestDispatcher("login.jsp").forward(request,response);
            result = "login.jsp";

        } else {
            if (fid == null || fid.equals("")) {
                fid = (String) session.getAttribute("fid");
            }
            int flowerid = 0;
            if (fid != null && !fid.equals("")) {
                flowerid = Integer.parseInt(fid);
            }
            System.out.println("Tuserid :" + tuser.getTuserid());
            System.out.println("addcarservlet flowerid " + flowerid);
            UserService us = new UserServiceImpl();
            try {
                int no = us.addCar(tuser, flowerid);
                if (no == 0) {
                    request.setAttribute("result", "添加失败");
                    System.out.println("添加失败");
                } else if (no == 1) {
                    request.setAttribute("result", "添加成功");
                    System.out.println("添加成功");
                } else if (no == 6) {
                    request.setAttribute("result", "已经添加过了");
                    System.out.println("已经添加过了");
                }
                //将需要显示在页面中的鲜花信息获取并进行存储
                List<ShopCar> shopCarList = us.getCar(tuser);
                System.out.println(shopCarList.toString());
                request.setAttribute("cars", shopCarList);
                //跳转到购物车界面
//                request.getRequestDispatcher("shoppingcart.jsp").forward(request,response);
                result = "shoppingcart.jsp";
            } catch (SQLException e) {
                Log.mylog.debug(e.getMessage());
                e.printStackTrace();
            }
        }

        return result;
    }

    //显示鲜花详细信息
    @RequestMapping("/detail")
    public String Detail(HttpServletRequest request) {
        //获取到当前鲜花的ID值
        String fid = request.getParameter("fid");
        //数据库中fid 为int,而service中方法的参数也为int , 所以需要转换数据类型
        System.out.println("Detail fid:" + fid);
        int flowerid = 0;
        if (fid != null && !fid.equals("")) {
            flowerid = Integer.parseInt(fid);
        }
        UserServiceImpl us = new UserServiceImpl();
        Flower flower = null;
        try {
            flower = us.getOne(flowerid);
            request.setAttribute("flower", flower);
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
        System.out.println(request.getParameter("result"));
        request.setAttribute("result", request.getParameter("result"));
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
