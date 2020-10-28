package com.etc.myshop.serviceImpl;

import com.etc.myshop.dao.WarehouseDao;
import com.etc.myshop.daoImpl.WarehouseDaoImpl;
import com.etc.myshop.entity.Detail;
import com.etc.myshop.entity.TShopcar;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.entity.TWarehouse;
import com.etc.myshop.service.WarehouseService;
import com.etc.myshop.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public List<TWarehouse> getAll() throws SQLException {
        WarehouseDao dao = new WarehouseDaoImpl();
        List<TWarehouse> tWarehouseList = null;
        try {
            ((WarehouseDaoImpl)dao).openTransaction();
            tWarehouseList = dao.getAll();
            ((WarehouseDaoImpl)dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("获取仓库内容出错" + e.getMessage());
            ((WarehouseDaoImpl)dao).rollbackTransaction();
        } finally {
            ((WarehouseDaoImpl)dao).closeResource();
        }
        return tWarehouseList;
    }

    @Override
    public Detail getOne(int detail_id) throws SQLException {
        WarehouseDao dao = new WarehouseDaoImpl();
        Detail detail = null;
        try {
            ((WarehouseDaoImpl)dao).openTransaction();
            detail = dao.getOne(detail_id);
            ((WarehouseDaoImpl)dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("获取单个内容出错" + e.getMessage());
            ((WarehouseDaoImpl)dao).rollbackTransaction();
        } finally {
            ((WarehouseDaoImpl)dao).closeResource();
        }
        return detail;
    }

    @Override
    public int addCart(TUser tUser, int id) throws SQLException {
        WarehouseDao dao = new WarehouseDaoImpl();
        int no = -1;
        try {
            ((WarehouseDaoImpl)dao).openTransaction();
            if (dao.judgeCar(tUser, id)){
                //购物车里面有，不需要添加
                no = 0;
            }else {
                no = dao.addToCar(tUser , id);
            }
            ((WarehouseDaoImpl)dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("添加进入购物车出错" + e.getMessage());
            ((WarehouseDaoImpl)dao).rollbackTransaction();
        } finally {
            ((WarehouseDaoImpl)dao).closeResource();
        }
        return no;
    }

    @Override
    public List<TShopcar> getCar(TUser tUser) throws SQLException {
        WarehouseDao dao = new WarehouseDaoImpl();
        List<TShopcar> tShopcars = new ArrayList<>();
        try {
            ((WarehouseDaoImpl)dao).openTransaction();
            tShopcars = dao.getCar(tUser.getTuser_id());
            ((WarehouseDaoImpl)dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("获取购物车内容出错" + e.getMessage());
            ((WarehouseDaoImpl)dao).rollbackTransaction();
        } finally {
            ((WarehouseDaoImpl)dao).closeResource();
        }
        return tShopcars;
    }

    public static void main(String[] args) throws SQLException {
        WarehouseServiceImpl w = new WarehouseServiceImpl();
        TUser tUser = new TUser();
        tUser.setTuser_id(2);
        List<TShopcar> tShopcars = w.getCar(tUser);
        for (TShopcar ts :
                tShopcars) {
            System.out.println(ts.getTwarehouse().getProduct_id());
        }
    }
}
