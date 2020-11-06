package com.etc.mybatis.ui;

import com.etc.mybatis.entity.Flower;
import com.etc.mybatis.entity.ShopCar;
import com.etc.mybatis.entity.Tuser;
import com.etc.mybatis.service.TuserService;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 12:14
 */
public class test {
    public static void main(String[] args) {
        TuserService ts = new TuserService();
//        ts.addTuser("lll",20);
//        ts.deleTuser("lll");
//        Tuser tuser = ts.getOne(1);
//        System.out.println(tuser.toString());
        Tuser tu = new Tuser();
        tu.setUname("rose");
        tu.setTid(1);
        /*List<Tuser> tusers = ts.getSome(tu);
        for (Tuser t :
                tusers) {
            System.out.println(t.getUname());
            System.out.println("tid:" + t.getTid());//与数据库字段不对应！！
            System.out.println("tuserid: " + t.getTuserid());//与数据库字段相对应
        }*/
        List<Flower> flowers = ts.getShopCarl();
        if (flowers.size() > 0) {
            for (Flower f :
                    flowers) {
                System.out.println(f.getFlowername());
                System.out.println(f.getShopCarList());
            }
        }

    }
}
