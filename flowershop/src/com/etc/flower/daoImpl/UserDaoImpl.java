package com.etc.flower.daoImpl;

import com.etc.flower.dao.UserDao;
import com.etc.flower.entity.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        UserDaoImpl udi = new UserDaoImpl();
        Tuser tuser = udi.login("rose","123","管理员");
        if (tuser != null){
            System.out.println(tuser.getUname()+" " +
                    tuser.getPwd() + " " +
                    tuser.getMoney()+ " " +
                    tuser.getRole()
                    );
        }else {
            System.out.println("查无此人");
        }

    }
    @Override
    public Tuser login(String username, String pwd, String role) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        String sql = "select * from tuser where uname = ? and pwd = ? and role = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,pwd);
        ps.setString(3,role);
        rs = ps.executeQuery();
        Tuser tuser = null;
        if (rs.next()){
            tuser = new Tuser();
            tuser.setUname(rs.getString(2));
            tuser.setAge(rs.getInt("age"));
            tuser.setTuserid(rs.getInt(1));
            tuser.setMoney(rs.getDouble(3));
            tuser.setPwd(rs.getString("pwd"));
            tuser.setRole(rs.getString("role"));
        }
        return tuser;
    }

    @Override
    public List<Flower> getAll(int page , int count) throws SQLException {
        String sql ="select * from flower limit ?,?";
        ps = con.prepareStatement(sql);
        System.out.println(page);
        System.out.println(count);
        int n = (page - 1) * count;
        System.out.println(n);
        ps.setInt(1,n); //当前页的起始页的起始记录的下标
        ps.setInt(2,count);//
        rs = ps.executeQuery();
        List<Flower> flowers = new ArrayList<>();
        Flower flower = null;
        while (rs.next()){
            flower =new Flower();
            flower.setFlowername(rs.getString("flowername"));
            flower.setCount(rs.getInt("count"));
            flower.setPrice(rs.getDouble("price"));
            flower.setType(rs.getString("type"));
            flower.setPic(rs.getString("pic"));
            flower.setFid(rs.getInt("fid"));
            flower.setFlowerspeak(rs.getString("flowerspeak"));
            flowers.add(flower);
        }
        return flowers;
    }

    /**
     * 显示鲜花详情
     * @param id
     * @return
     */
    @Override
    public Flower getOne(int id) throws SQLException {
        String sql = "select * from flower where fid = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,id);//处理占位符
        rs = ps.executeQuery();
        Flower flower = null;
        if (rs.next()){
            flower = new Flower();
            flower.setType(rs.getString("type"));
            flower.setPrice(rs.getDouble("price"));
            flower.setCount(rs.getInt("count"));
            flower.setFlowername(rs.getString("flowername"));
            flower.setFid(rs.getInt("fid"));
            flower.setPic(rs.getString("pic"));
            flower.setFlowerspeak(rs.getString("flowerspeak"));
        }
        return flower;
    }

    /**
     * 判断购物车中是否有此鲜花
     * @param tuser
     * @param id
     * @return
     */
    @Override
    public boolean judgeCar(Tuser tuser, int id) throws SQLException {
        String sql = "SELECT * from shopcar WHERE fid = ? and tuserid = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setInt(2,tuser.getTuserid());
        rs = ps.executeQuery();
        boolean flag = false;
        if (rs.next()){
            flag = true;
        }
        return flag;
    }

    /**
     * 添加鲜花到购物车
     * @param tuser
     * @param id
     * @return
     * @throws SQLException
     */
    @Override
    public int addCar(Tuser tuser, int id) throws SQLException {
        String sql = "insert into shopcar(fid,tuserid) values (? , ?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setInt(2,tuser.getTuserid());
        return ps.executeUpdate();
    }

    /**
     * 显示购物车中的鲜花信息
     * @param tuser
     * @return
     */
    @Override
    public List<ShopCar> getCar(Tuser tuser) throws SQLException {
        String sql = "select f.flowername,f.price ,f.fid, f.count,f.pic,s.sid from shopcar s , flower f where f.fid = s.fid and s.tuserid = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,tuser.getTuserid());
        rs = ps.executeQuery();
        List<ShopCar> shopCars = new ArrayList<>();
        while (rs.next()){
            ShopCar shopCar = new ShopCar();
            Flower flower = new Flower();
            flower.setFlowername(rs.getString("flowername"));
            flower.setPrice(rs.getDouble("price"));
            flower.setCount(rs.getInt("count"));
            flower.setPic(rs.getString("pic"));
            flower.setFid(rs.getInt("fid"));
            shopCar.setSid(rs.getInt("sid"));
            shopCar.setFlower(flower);
            shopCars.add(shopCar);
        }
        return shopCars;
    }

    @Override
    public Address getAddress(Tuser tuser) throws SQLException {
        String sql = "select * from address where state = 1 and tuserid = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,tuser.getTuserid());
        rs = ps.executeQuery();
        Address address = null;
        if (rs.next()){
            address = new Address();
            address.setAid(rs.getInt("aid"));
            address.setAddress(rs.getString("address"));
            address.setCountry(rs.getString("country"));
            address.setCity(rs.getString("city"));
            address.setEmail(rs.getString("email"));
            address.setPhone(rs.getString("phone"));
            address.setState(rs.getInt("state"));
        }
        return address;
    }

    @Override
    public int addAddress(Tuser tuser, Address address) throws SQLException {
        String sql = "insert into address(tuserid, address, country, city, email, phone) values (?,?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1,tuser.getTuserid());
        ps.setString(2,address.getAddress());
        ps.setString(3,address.getCountry());
        ps.setString(4,address.getCity());
        ps.setString(5,address.getEmail());
        ps.setString(6,address.getPhone());
        return ps.executeUpdate();
    }

    @Override
    public List<Address> addressList(Tuser tuser) throws SQLException {
        String sql = "select * from address where  tuserid = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,tuser.getTuserid());
        rs = ps.executeQuery();
        List<Address> addressList = new ArrayList<>();
        Address address = null;
        while (rs.next()){
            address = new Address();
            address.setAddress(rs.getString("address"));
            address.setCity(rs.getString("city"));
            address.setCountry(rs.getString("country"));
            address.setEmail(rs.getString("email"));
            address.setPhone(rs.getString("phone"));
            address.setState(rs.getInt("state"));
            address.setAid(rs.getInt("aid"));
            addressList.add(address);
        }
        return addressList;
    }

    @Override
    public Address oneAddress(int aid) throws SQLException {
        String sql ="select * from address where  aid = '"+aid+"'";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        Address address = null;
        if (rs.next()){
            address = new Address();
            address.setAid(aid);
            address.setState(rs.getInt("state"));
            address.setPhone(rs.getString("phone"));
            address.setEmail(rs.getString("email"));
            address.setCountry(rs.getString("country"));
            address.setCity(rs.getString("city"));
            address.setAddress(rs.getString("address"));
        }
        return address;
    }

    /**
     * 修改收货地址
     * @param tuser
     * @param address
     * @return
     * @throws SQLException
     */
    @Override
    public int updataAddress(Tuser tuser, Address address) throws SQLException {
        String sql = "update address a set a.address=? , a.country = ?,a.city=?,a.email=?,a.phone=? where a.aid =? and tuserid = ?";
        ps = con.prepareStatement(sql);
        System.out.println(address.getAid()+address.getAddress()+address.getCountry()+address.getCity()+address.getEmail()+address.getPhone()+tuser.getTuserid());
        ps.setString(1,address.getAddress());
        ps.setString(2,address.getCountry());
        ps.setString(3,address.getCity());
        ps.setString(4,address.getEmail());
        ps.setString(5,address.getPhone());
        ps.setInt(6,address.getAid());
        ps.setInt(7,tuser.getTuserid());
        return ps.executeUpdate();
    }


    @Override
    public int updateCount(Tuser tuser, double sum) throws SQLException {
        String sql = "update tuser set money = money - ? where  tuserid = ?";
        ps = con.prepareStatement(sql);
        ps.setDouble(1,sum);
        ps.setInt(2,tuser.getTuserid());
        return ps.executeUpdate();
    }
//修改鲜花数量
    @Override
    public void updateFcount(int flowerid, int count) throws SQLException {
        String sql = "update flower set count = count - ? where fid=?";
        ps = con.prepareStatement(sql);
        ps.setInt(1,count);
        ps.setInt(2,flowerid);
        ps.executeUpdate();
    }

    @Override
    public void addOrder(Tuser tuser, double sum) throws SQLException {
        String sql = "insert into forder(tuserid, sum, orderdate) values (?,?,now())";
        ps = con.prepareStatement(sql);
        ps.setInt(1,tuser.getTuserid());
        ps.setDouble(2,sum);
        ps.executeUpdate();
    }

    @Override
    public int getOid() throws SQLException {
        String sql = "select max(oid) from forder";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        int oid = 0 ;
        if (rs.next()){
            oid = rs.getInt(1);
        }
        return oid;
    }

    @Override
    public void addDetail(int oid, int flowerid, int count, double fsum) throws SQLException {
        String sql = "insert into odetail(oid , fid , count ,sum) values (?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1,oid);
        ps.setInt(2,flowerid);
        ps.setInt(3,count);
        ps.setDouble(4,fsum);
        ps.executeUpdate();
    }

    @Override
    public void removeCar(Tuser tuser, int flowerid) throws SQLException {
        String sql = "delete from shopcar where fid = ? and tuserid = ?;";
        ps = con.prepareStatement(sql);
        ps.setInt(1,flowerid);
        ps.setInt(2,tuser.getTuserid());
        ps.executeUpdate();
    }

    @Override
    public int morenAddress(int aid) throws SQLException {
        String sql ="update address set state  = null where state = 1 ";
        (st = con.createStatement()).executeUpdate(sql);
        sql = "update address set state = 1 where aid = '"+aid+"'";
        return (st = con.createStatement()).executeUpdate(sql);
    }

    @Override
    public boolean ajaxCity(String city) throws SQLException {
        System.out.println("dao city : " + city);
        String sql = "select city from address where city = ?  ";
        ps = con.prepareStatement(sql);
        ps.setString(1,city);
        rs = ps.executeQuery();
        boolean flag = false;
        if (rs.next()){
            flag = true;
        }
        System.out.println("flag : " + flag) ;
        return flag;
    }

    @Override
    public void upload(Flower flower) throws SQLException {
        String sql = "insert into flower (flowername , price , type , count , pic ) VALUES (?,?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setString(1,flower.getFlowername());
        ps.setDouble(2,flower.getPrice());
        ps.setString(3,flower.getType());
        ps.setInt(4,flower.getCount());
        ps.setString(5,flower.getPic());
        ps.executeUpdate();
    }

    @Override
    public List<Forder> getOrder(Tuser tuser, Date start, Date end,int page1,int count) throws SQLException {
        int n = (page1 - 1) * count;
        //因为条件可能有，可能没有，所以不能使用以下方式来完成SQL语句，只能是有值传递的时候才能使用
//        String sql = "select * from forder where tuserid =1 and orderdate > now() and orderdate < now() ;";
        //即以上的SQL语句需要进行一种字符串的拼接
        String sql = "select * from forder where 1 = 1    ";
        if (tuser.getTuserid() > 0){
            sql += " and tuserid = '" +tuser.getTuserid()+ "'  ";
        }
        if (start != null){
            sql += " and orderdate >= '"+new java.sql.Date(start.getTime()) +"' ";
        }
        if (end != null){
            sql += " and orderdate <= '"+new java.sql.Date(end.getTime())+"' ";
        }
            sql += " limit ?,? ";
        ps = con.prepareStatement(sql);
        ps.setInt(1,n);
        ps.setInt(2,count);
        rs = ps.executeQuery();
        List<Forder> forderList = new ArrayList<>();
        while (rs.next()){
            Tuser tuser1 = new Tuser();
            tuser1.setTuserid(rs.getInt("tuserid"));
            Forder forder = new Forder(rs.getInt("oid") ,tuser1,rs.getDouble("sum"),rs.getDate("orderdate"));
            forderList.add(forder);
        }

        return forderList;
    }

    /**
     * 获取到一共多少页
     * @param i
     * @return
     */
    @Override
    public int getPage(int i) throws SQLException {
        String sql = "select count(*) from flower";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        int count = 0 ;
        if (rs.next()){
            count = rs.getInt(1);
        }
        int page = 0 ;
        if (count % i == 0) page = count / i;
        else page = count / i +1;
        return page;
    }

    @Override
    public void clearCart(Tuser tuser) throws SQLException {
        String sql = "delete from shopcar where tuserid = '"+tuser.getTuserid()+"'" ;
        st = con.createStatement();
        st.executeUpdate(sql);
    }

    @Override
    public void deleteOne(int sid) throws SQLException {
        String sql = "delete from shopcar where sid = '"+sid+"'";
        st = con.createStatement();
        st.executeUpdate(sql);
    }

    @Override
    public List<Forder> getOrderPage(Tuser tuser, Date start, Date end, int i) throws SQLException {
        //因为条件可能有，可能没有，所以不能使用以下方式来完成SQL语句，只能是有值传递的时候才能使用
//        String sql = "select * from forder where tuserid =1 and orderdate > now() and orderdate < now() ;";
        //即以上的SQL语句需要进行一种字符串的拼接
        String sql = "select * from forder where 1 = 1    ";
        if (tuser.getTuserid() > 0){
            sql += " and tuserid = '" +tuser.getTuserid()+ "'  ";
        }
        if (start != null){
            sql += " and orderdate >= '"+new java.sql.Date(start.getTime()) +"' ";
        }
        if (end != null){
            sql += " and orderdate <= '"+new java.sql.Date(end.getTime())+"' ";
        }
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        List<Forder> forderList = new ArrayList<>();
        int getOrdercount = 0;
        int allpage1 = 0;
        while (rs.next()){
            getOrdercount++;
            Tuser tuser1 = new Tuser();
            tuser1.setTuserid(rs.getInt("tuserid"));
            Forder forder = new Forder(rs.getInt("oid") ,tuser1,rs.getDouble("sum"),rs.getDate("orderdate"));

            //分页
            System.out.println("后台的多条件查询结果条数：" + getOrdercount);
            System.out.println("dao getOrdercount " + getOrdercount);
            if ( getOrdercount % i == 0) allpage1 = getOrdercount / i;
            else allpage1 = getOrdercount / i +1;
            System.out.println("dao allpage1 : " + allpage1);
            forder.setPage(allpage1);
            forderList.add(forder);
        }

        return forderList;
    }
}
