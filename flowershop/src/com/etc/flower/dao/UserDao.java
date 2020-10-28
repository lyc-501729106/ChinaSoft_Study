package com.etc.flower.dao;

import com.etc.flower.entity.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserDao {
    public Tuser login(String username , String pwd,String role) throws SQLException, URISyntaxException, IOException, ClassNotFoundException;
    //显示所有鲜花信息
    public List<Flower> getAll(int page , int count) throws SQLException;
    //显示鲜花详情
    Flower getOne(int id) throws SQLException;

    boolean judgeCar(Tuser tuser, int id) throws SQLException;
    //添加鲜花到购物车
    int addCar(Tuser tuser, int id) throws SQLException;
    //获取到购物车鲜花信息
    List<ShopCar> getCar(Tuser tuser) throws SQLException;
    //获取默认地址
    Address getAddress(Tuser tuser) throws SQLException;

    int addAddress(Tuser tuser, Address address) throws SQLException;

    List<Address> addressList(Tuser tuser) throws SQLException;

    Address oneAddress(int aid) throws SQLException;

    int updataAddress(Tuser tuser, Address address) throws SQLException;
//修改账户余额
    int updateCount(Tuser tuser, double sum) throws SQLException;
//修改鲜花数量
    void updateFcount(int flowerid, int count) throws SQLException;
//添加订单信息
    void addOrder(Tuser tuser, double sum) throws SQLException;
//获取订单号
    int getOid() throws SQLException;
//添加订单详情
    void addDetail(int oid, int flowerid, int count, double fsum) throws SQLException;
//清理购物车
    void removeCar(Tuser tuser, int flowerid) throws SQLException;
//设为默认地址
    int morenAddress(int aid) throws SQLException;

    boolean ajaxCity(String city) throws SQLException;

    void upload(Flower flower) throws SQLException;
//查询订单
    List<Forder> getOrder(Tuser tuser, Date start, Date end,int page1,int count ) throws SQLException;
//获取到一共有多少页
    int getPage(int i) throws SQLException;
//清空购物车
    void clearCart(Tuser tuser) throws SQLException;
//删除购物车里的一个商品
    void deleteOne(int sid) throws SQLException;
//获取总页数
    List<Forder> getOrderPage(Tuser tuser, Date s, Date e, int i) throws SQLException;
}
