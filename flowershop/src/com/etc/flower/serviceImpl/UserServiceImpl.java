package com.etc.flower.serviceImpl;

import com.etc.flower.dao.UserDao;
import com.etc.flower.daoImpl.UserDaoImpl;
import com.etc.flower.daoImpl.UserDaoMybaitsImpl;
import com.etc.flower.entity.*;
import com.etc.flower.service.UserService;
import com.etc.flower.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Override
    public Tuser login(String username, String pwd, String role) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        Tuser tuser = null;
        try {
            ((UserDaoMybaitsImpl) dao).openDb();
            tuser = dao.login(username, pwd, role);
        } catch (Exception e) {
            //日志
            Log.mylog.debug(e.getMessage() + "登录出错！");
            e.printStackTrace();
        } finally {
            //关闭数据库
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
        return tuser;
    }

    /**
     * 显示鲜花信息
     *
     * @return
     */
    @Override
    public List<Flower> getAll(int page, int count) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        List<Flower> flowers = null;
        try {
            ((UserDaoMybaitsImpl) dao).openDb();
            flowers = dao.getAll(page, count);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage() + "显示所有鲜花信息");
        } finally {
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
        return flowers;
    }

    /**
     * 获取某一鲜花详情
     *
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public Flower getOne(int id) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        Flower flower = null;
        try {
            ((UserDaoMybaitsImpl) dao).openDb();
            flower = dao.getOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("一朵花详情" + e.getMessage());
        } finally {
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
        return flower;
    }

    @Override
    public int addCar(Tuser tuser, int id) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        int no = 0;
        try {
            ((UserDaoMybaitsImpl) dao).openDb();
            if (dao.judgeCar(tuser, id)) {
                //如果有鲜花，则不需要再添加
                no = 6;
            } else {
                //如果没有此鲜花，则取药添加到购物车中
                no = dao.addCar(tuser, id);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("一朵花详情" + e.getMessage());
        } finally {
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
        return no;
    }

    /**
     * 获取到所有的鲜花信息
     *
     * @param tuser
     * @return
     * @throws SQLException
     */
    @Override
    public List<ShopCar> getCar(Tuser tuser) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        List<ShopCar> shopCars = null;
        try {
            ((UserDaoMybaitsImpl) dao).openDb();
            shopCars = dao.getCar(tuser);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("一朵花详情" + e.getMessage());
        } finally {
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
        return shopCars;
    }

    /**
     * 显示默认地址
     *
     * @param tuser
     * @return
     */
    @Override
    public Address getAddress(Tuser tuser) throws SQLException {
        UserDao dao = new UserDaoImpl();
        Address address = null;
        try {
            ((UserDaoImpl) dao).openTransaction();
            address = dao.getAddress(tuser);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("显示默认地址出错" + e.getMessage());
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return address;
    }

    @Override
    public int addAddress(Tuser tuser, Address address) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int no = 0;
        try {
            ((UserDaoImpl) dao).openTransaction();
            no = dao.addAddress(tuser, address);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("添加地址出错" + e.getMessage());
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return no;
    }

    @Override
    public List<Address> addressList(Tuser tuser) throws SQLException {
        UserDao dao = new UserDaoImpl();
        List<Address> addressList = new ArrayList<>();
        try {
            ((UserDaoImpl) dao).openTransaction();
            addressList = dao.addressList(tuser);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("获取当前用户所有地址出错" + e.getMessage());
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return addressList;
    }

    @Override
    public Address oneAddress(int aid) throws SQLException {
        UserDao dao = new UserDaoImpl();
        Address address = null;
        try {
            ((UserDaoImpl) dao).openTransaction();
            address = dao.oneAddress(aid);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("获取当前用户所有地址出错" + e.getMessage());
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return address;
    }

    @Override
    public int updataAddress(Tuser tuser, Address address) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int no = 0;
        try {
            ((UserDaoImpl) dao).openTransaction();
            no = dao.updataAddress(tuser, address);
            ((UserDaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("修改当前地址出错" + e.getMessage());
            ((UserDaoImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return no;
    }

    @Override
    public void pay(Tuser tuser, double sum, Map<String, Integer> countMap, Map<String, Double> sumMap, String[] ids) throws SQLException {
        UserDao dao = new UserDaoMybaitsImpl();
        int no = 0;
        try {
            ((UserDaoMybaitsImpl) dao).openTransaction();
            //修改账户余额：Tuser，交易总价sum
            dao.updateCount(tuser, sum);

            for (String fid :
                    ids) {
                //修改各自鲜花的数量：根据鲜花的ID得到鲜花的数量：countMap
                int flowerid = Integer.parseInt(fid);
                int count = countMap.get(fid);
                dao.updateFcount(flowerid, count);
            }
            //添加订单信息：Tuser ，sum
            dao.addOrder(tuser, sum);
            //获取到订单的ID号
            int oid = dao.getOid();
            //添加订单详情：countMap，每一种鲜花支付的总额：sumMap
            for (String fid :
                    ids) {
                int flowerid = Integer.parseInt(fid);
                System.out.println("flowerid: " + flowerid);
                System.out.println("countMap: " + countMap);
                System.out.println("sumMap: " + sumMap);
                int count = countMap.get(fid);
                double fsum = sumMap.get(fid);
                dao.addDetail(oid, flowerid, count, fsum);
                //清理购物车：鲜花的ID数组：fids
                dao.removeCar(tuser, flowerid);
            }


            //事务的提交
            ((UserDaoMybaitsImpl) dao).commitTransaction();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("支付出错" + e.getMessage());
            ((UserDaoMybaitsImpl) dao).rollbackTransaction();
        } finally {
            ((UserDaoMybaitsImpl) dao).closeResource();
        }
    }

    //设为默认地址
    @Override
    public int morenAddress(int aid) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int no = 0;
        try {
            ((UserDaoImpl) dao).openDb();
            no = dao.morenAddress(aid);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("修改当前地址出错" + e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return no;
    }

    @Override
    public boolean ajaxCity(String city) throws SQLException {
        UserDao dao = new UserDaoImpl();
        boolean flag = false;
        try {
            ((UserDaoImpl) dao).openDb();
            flag = dao.ajaxCity(city);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug("用ajax校验城市出错" + e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        System.out.println("servide flag : " + flag);
        return flag;
    }

    @Override
    public void upload(Flower flower) throws SQLException {
        UserDao dao = new UserDaoImpl();
        try {
            ((UserDaoImpl) dao).openDb();
            dao.upload(flower);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
    }

    @Override
    public List<Forder> getOrder(Tuser tuser, Date start, Date end, int page1, int count) throws SQLException {
        UserDao dao = new UserDaoImpl();
        List<Forder> forderList = new ArrayList<>();
        try {
            ((UserDaoImpl) dao).openDb();
            forderList = dao.getOrder(tuser, start, end, page1, count);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return forderList;
    }

    @Override
    public int getPage(int i) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int all = 0;
        try {
            ((UserDaoImpl) dao).openDb();
            all = dao.getPage(i);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return all;
    }

    @Override
    public void clearCart(Tuser tuser) throws SQLException {
        UserDao dao = new UserDaoImpl();

        try {
            ((UserDaoImpl) dao).openDb();
            dao.clearCart(tuser);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
    }

    @Override
    public void deleteOne(int sid) throws SQLException {
        UserDao dao = new UserDaoImpl();

        try {
            ((UserDaoImpl) dao).openDb();
            dao.deleteOne(sid);
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
    }

    @Override
    public List<Forder> getOrderPage(Tuser tuser, Date s, Date e, int i) throws SQLException {
        UserDao dao = new UserDaoImpl();
        List<Forder> forderList = new ArrayList<>();
        try {
            ((UserDaoImpl) dao).openDb();
            forderList = dao.getOrderPage(tuser, s, e, i);
        } catch (Exception e1) {
            e1.printStackTrace();
            Log.mylog.debug(e1.getMessage());
        } finally {
            ((UserDaoImpl) dao).closeResource();
        }
        return forderList;
    }


    public static void main(String[] args) throws SQLException {
        UserServiceImpl us = new UserServiceImpl();
        Tuser tuser = new Tuser();
        tuser.setTuserid(0);
        us.clearCart(tuser);

    }
}
