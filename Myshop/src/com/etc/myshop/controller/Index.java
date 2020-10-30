package com.etc.myshop.controller;

import com.etc.myshop.entity.TWarehouse;
import com.etc.myshop.service.WarehouseService;
import com.etc.myshop.serviceImpl.WarehouseServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/10/29 - 19:37
 */
@Controller
public class Index {
    @RequestMapping("/index")
    public String startIndex(HttpServletRequest request){
        System.out.println("index");
        return "main.jsp";
    }
}
