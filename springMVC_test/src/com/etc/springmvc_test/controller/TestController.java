package com.etc.springmvc_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 吕译辰
 * @Date 2020/10/29 - 11:58
 */
//为了表示当前类为控制类，我们需要添加@Controller注解
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("/test")
    public String test(String uname, int money, Model model) {
        System.out.println(uname + "   " + money);
        model.addAttribute("result","给我肾宝！");
        return "ok.jsp";
    }
    @RequestMapping("/show")
    public String show(){
        return "ok.jsp";
    }
}
