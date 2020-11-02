package com.etc.mybatis.ui;

import com.etc.mybatis.entity.Tuser;
import com.etc.mybatis.service.TuserService;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 12:14
 */
public class test {
    public static void main(String[] args) {
        TuserService ts = new TuserService();
//        ts.addTuser("lll",20);
//        ts.deleTuser("lll");
        Tuser tuser = ts.getOne(1);
        System.out.println(tuser.toString());

    }
}
