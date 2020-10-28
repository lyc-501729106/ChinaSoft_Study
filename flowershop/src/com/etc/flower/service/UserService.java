package com.etc.flower.service;

import com.etc.flower.entity.*;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserService {
    public Tuser login(String username , String pwd,String role) throws SQLException;
    //显示鲜花信息
    public List<Flower> getAll(int page ,int count) throws SQLException;
    //显示某个鲜花的信息
    public Flower getOne(int id) throws SQLException;
    //添加进购物车
    public int addCar (Tuser tuser , int id) throws SQLException;
    //显示购物车中的信息
    List<ShopCar> getCar(Tuser tuser ) throws SQLException;
    //显示默认地址
    public Address getAddress(Tuser tuser) throws SQLException;
    //给用户添加一个地址
    public int addAddress(Tuser tuser ,Address address) throws SQLException;
    //获取所有地址
    List<Address> addressList(Tuser tuser) throws SQLException;
    //获取单个地址
    Address oneAddress(int aid) throws SQLException;
    //修改单个地址
    int updataAddress(Tuser tuser,Address address) throws SQLException;
//支付
    void pay(Tuser tuser, double sum, Map<String, Integer> countMap, Map<String, Double> sumMap, String[] ids) throws SQLException;
//设为默认地址
    int morenAddress(int aid) throws SQLException;
    //用ajax来实现校验city的功能呢
    boolean ajaxCity(String city) throws SQLException;
//上传鲜花信息
    void upload(Flower flower) throws SQLException;
    //查询订单信息(多条件查询)
    List<Forder> getOrder(Tuser tuser , Date start , Date end,int page1,int count) throws SQLException;
//计算一共有多少页
    int getPage(int i) throws SQLException;
    //清空购物车
    void clearCart(Tuser tuser) throws SQLException;
    //删除购物车里的一个商品
    void deleteOne(int sid) throws SQLException;
//总页数计算
    List<Forder> getOrderPage(Tuser tuser, Date s, Date e, int i) throws SQLException;
}
