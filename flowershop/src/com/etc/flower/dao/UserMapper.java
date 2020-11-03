package com.etc.flower.dao;

import com.etc.flower.entity.Flower;
import com.etc.flower.entity.ShopCar;
import com.etc.flower.entity.Tuser;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/3 - 9:44
 */
public interface UserMapper {
    //获取所有鲜花信息
    List<Flower> getAll(int n, int count);
    //获取一个鲜花信息
    Flower getOne(int id);
    //判断购物车中是否已经有当前商品信息
    ShopCar judegeCar(int id, int tuserid);
    //添加到购物车
    int addCar(int id, int tuserid);
    //获取到购物车中的商品信息
    List<ShopCar> getCar(int tuserid);
    //登录功能
    Tuser login(String username, String pwd, String role);
    //修改账户余额
    int updateCount(double sum, int tuserid);

    void updateFcount(int count, int flowerid);

    void addOrder(int tuserid, double sum);

    int getOid();

    void addDetail(int oid, int flowerid, int count, double fsum);

    void removeCar(int flowerid, int tuserid);
}
