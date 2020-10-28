package com.etc.myshop.service;

import com.etc.myshop.entity.Detail;
import com.etc.myshop.entity.TShopcar;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.entity.TWarehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    public List<TWarehouse> getAll() throws SQLException;

    Detail getOne(int detail_id) throws SQLException;
    //添加进入购物车
    int addCart(TUser tUser , int id) throws SQLException;
    //获取到购物车的所有
    List<TShopcar> getCar(TUser tUser) throws SQLException;

}
