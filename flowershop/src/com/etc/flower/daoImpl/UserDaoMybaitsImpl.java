package com.etc.flower.daoImpl;

import com.etc.flower.dao.UserDao;
import com.etc.flower.dao.UserMapper;
import com.etc.flower.entity.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/3 - 9:34
 */
public class UserDaoMybaitsImpl extends BaseDaoMybaitsImpl implements UserDao {
    @Override
    public Tuser login(String username, String pwd, String role) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Tuser tuser = userMapper.login(username, pwd, role);
        return tuser;
    }

    @Override
    public List<Flower> getAll(int page, int count) throws SQLException {
        System.out.println(page);
        System.out.println(count);
        int n = (page - 1) * count;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Flower> flowers = userMapper.getAll(n, count);
        return flowers;
    }

    @Override
    public Flower getOne(int id) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Flower flower = userMapper.getOne(id);
        return flower;
    }

    @Override
    public boolean judgeCar(Tuser tuser, int id) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ShopCar shopCar = userMapper.judegeCar(id, tuser.getTuserid());
        boolean flag = false;
        if (shopCar != null) {
            flag = true;
        }
        return flag;
    }

    @Override
    public int addCar(Tuser tuser, int id) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.addCar(id, tuser.getTuserid());
    }

    @Override
    public List<ShopCar> getCar(Tuser tuser) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<ShopCar> shopCarList = userMapper.getCar(tuser.getTuserid());
        return shopCarList;
    }

    @Override
    public Address getAddress(Tuser tuser) throws SQLException {
        return null;
    }

    @Override
    public int addAddress(Tuser tuser, Address address) throws SQLException {
        return 0;
    }

    @Override
    public List<Address> addressList(Tuser tuser) throws SQLException {
        return null;
    }

    @Override
    public Address oneAddress(int aid) throws SQLException {
        return null;
    }

    @Override
    public int updataAddress(Tuser tuser, Address address) throws SQLException {
        return 0;
    }

    @Override
    public int updateCount(Tuser tuser, double sum) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.updateCount(sum, tuser.getTuserid());
    }

    @Override
    public void updateFcount(int flowerid, int count) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateFcount(count, flowerid);
    }

    @Override
    public void addOrder(Tuser tuser, double sum) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addOrder(tuser.getTuserid(), sum);
    }

    @Override
    public int getOid() throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.getOid();
    }

    @Override
    public void addDetail(int oid, int flowerid, int count, double fsum) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addDetail(oid, flowerid, count, fsum);
    }

    @Override
    public void removeCar(Tuser tuser, int flowerid) throws SQLException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.removeCar(flowerid,tuser.getTuserid());
    }

    @Override
    public int morenAddress(int aid) throws SQLException {
        return 0;
    }

    @Override
    public boolean ajaxCity(String city) throws SQLException {
        return false;
    }

    @Override
    public void upload(Flower flower) throws SQLException {

    }

    @Override
    public List<Forder> getOrder(Tuser tuser, Date start, Date end, int page1, int count) throws SQLException {
        return null;
    }

    @Override
    public int getPage(int i) throws SQLException {
        return 0;
    }

    @Override
    public void clearCart(Tuser tuser) throws SQLException {

    }

    @Override
    public void deleteOne(int sid) throws SQLException {

    }

    @Override
    public List<Forder> getOrderPage(Tuser tuser, Date s, Date e, int i) throws SQLException {
        return null;
    }
}
