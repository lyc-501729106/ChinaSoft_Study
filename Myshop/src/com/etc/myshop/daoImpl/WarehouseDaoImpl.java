package com.etc.myshop.daoImpl;

import com.etc.myshop.dao.WarehouseDao;
import com.etc.myshop.entity.Detail;
import com.etc.myshop.entity.TShopcar;
import com.etc.myshop.entity.TUser;
import com.etc.myshop.entity.TWarehouse;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WarehouseDaoImpl extends BaseDaoImpl implements WarehouseDao {
    @Override
    public List<TWarehouse> getAll() throws SQLException {
        String sql = "select * from twarehouse";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        TWarehouse tWarehouse = null;
        List<TWarehouse> tWarehouseList = new ArrayList<>();
        while (rs.next()){
            tWarehouse = new TWarehouse();
            tWarehouse.setName(rs.getString("name"));
            tWarehouse.setEnterday(rs.getDate("enterday"));
            tWarehouse.setInfo(rs.getString("info"));
            tWarehouse.setPrice(rs.getDouble("price"));
            tWarehouse.setNum(rs.getInt("num"));
            tWarehouse.setPic(rs.getString("pic"));
            tWarehouse.setProduct_id(rs.getInt("product_id"));
            tWarehouseList.add(tWarehouse);
        }
        return tWarehouseList;
    }

    @Override
    public Detail getOne(int detail_id) throws SQLException {
//        String sql = "select * from detail WHERE detail_id = '"+detail_id+"'";
        String sql = "select w.pic,w.price,w.info,w.name,w.num,w.spic,d.detail_id from detail d ,twarehouse w WHERE d.detail_id = w.product_id and d.detail_id = '"+detail_id+"'";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        Detail detail = new Detail();
        if (rs.next()){
            detail.setDetail_id(rs.getInt("detail_id"));
            detail.setPic(rs.getString("pic"));
            detail.setInfo(rs.getString("info"));
            detail.setPrice(rs.getDouble("price"));
        }
        return detail;
    }

    /**
     * 查看购物车是否有此商品
     * @param tUser
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public boolean judgeCar(TUser tUser, int id) throws SQLException {
        String sql = "select * from tshopcar where tuser_id = '"+tUser.getTuser_id()+"' and product_id ='"+id+"'";
        boolean flag = false;
        st = con.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()){
            flag = true;
        }
        return flag;
    }

    /**
     * 添加进入购物车
     * @param tUser
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public int addToCar(TUser tUser ,int id) throws SQLException {
        String sql = "insert into tshopcar(product_id, tuser_id) values (?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(2,tUser.getTuser_id());
        ps.setInt(1,id);
        return ps.executeUpdate();
    }

    @Override
    public List<TShopcar> getCar(int tuser_id) throws SQLException {
        String sql = "select * from tshopcar where tuser_id = '" + tuser_id + "'";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        int product_id = 0;
        List<TShopcar> tShopcars = new ArrayList<>();
        while (rs.next()) {
            product_id = rs.getInt(2);
        }
        sql = "select w.`name` , w.product_id ,w.spic, w.price,w.pic,w.num,w.info from twarehouse w , tshopcar s WHERE w.product_id = s.product_id and s.tuser_id = '"+tuser_id+"'";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        TWarehouse tWarehouse = null;

        while (rs.next()) {
            TShopcar tShopcar = new TShopcar();
            tWarehouse = new TWarehouse();
            tWarehouse.setProduct_id(rs.getInt("product_id"));
            tWarehouse.setName(rs.getString("name"));
            tWarehouse.setPrice(rs.getDouble("price"));
            tWarehouse.setNum(rs.getInt("num"));
            tWarehouse.setPic(rs.getString("pic"));
            tWarehouse.setInfo(rs.getString("info"));
            tWarehouse.setSpic(rs.getString("spic"));
            tShopcar.setTwarehouse(tWarehouse);
            tShopcars.add(tShopcar);
        }

        return tShopcars;
    }
}
