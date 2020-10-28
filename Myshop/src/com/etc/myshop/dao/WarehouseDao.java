package com.etc.myshop.dao;

import com.etc.myshop.entity.Detail;
import com.etc.myshop.entity.TShopcar;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.entity.TWarehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseDao {
    public List<TWarehouse> getAll() throws SQLException;

    Detail getOne(int detail_id) throws SQLException;
    //判断购物车里是否有此物
    boolean judgeCar(TUser tUser, int id) throws SQLException;
    //添加进入购物车
    int addToCar(TUser tUser ,int id) throws SQLException;

    List<TShopcar> getCar(int tuser_id) throws SQLException;
}
