package com.etc.jdbcdemo.daoImpl;

import com.etc.jdbcdemo.dao.StudentDao;
import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Studentnew;
import com.etc.jdbcdemo.entity.Tclass;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends BaseDaoImpl implements StudentDao {
    @Override
    public Student login(String username, String pwd) throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        openDb();
        System.out.println("数据库连接成功!");
        String sql = "select * from student where stuname = ? and pwd = ?" ;
        //sql语句进行预编译 (如果驱动程序支持预编译，该方法prepareStatement将把该语句发送给数据库进行预编译)
        ps = con.prepareStatement(sql) ;
        //当有占位符? 的时候，就需要对预编译对象进行占位符的处理
        ps.setString(1 , username);
        ps.setString(2 , pwd);
        //执行sql语句,返回值为一个结果集 ps.executeUpdate() ;返回一个int 表示受影响行(增删改)
        rs = ps.executeQuery() ;
        Student stu = null ;
        while (rs.next()){
            stu = new Student() ;
            System.out.println(rs.getString("stuname") + "---");
            stu.setAge(rs.getInt("age")); //把查询的结果存进age
            stu.setPwd(rs.getString("pwd"));
            stu.setStuname(rs.getString("stuname"));
            stu.setSid(rs.getInt("sid"));
        }
        return stu;
    }

    /**
     * 查询所有学生信息
     * @return
     */
    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        openDb();
        String sql = "select * from student;" ;
        //预编译
        ps = con.prepareStatement(sql) ;
        rs = ps.executeQuery() ;
        List<Student> list = new ArrayList<>() ;
        while (rs.next()){
            Student stu = new Student() ;
            stu.setSid(rs.getInt("sid"));
            stu.setStuname(rs.getString("stuname"));
            stu.setPwd(rs.getString("pwd"));
            stu.setAge(rs.getInt("age"));
            list.add(stu) ;
        }
        return list;
    }

    @Override
    public int regist(Student stu) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        openDb();
        String sql = "insert into student (stuname , age , pwd) values (? , ? , ?)" ;
        ps = con.prepareStatement(sql) ;
        ps.setString(1 , stu.getStuname());
        ps.setInt(2 , stu.getAge());
        ps.setString(3 , stu.getPwd());
        int num = ps.executeUpdate() ; //返回值为int 表示受影响的行数
        return num ;
    }

    @Override
    public int del(String username) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        openDb();
        String sql = "delete from student where stuname = ? ;" ;
        ps = con.prepareStatement(sql) ;
        ps.setString(1, username);
        return ps.executeUpdate() ;
    }

    @Override
    public int update(String username, String pwd) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        openDb();
        String sql = "update student set pwd = ? where stuname = ?" ;
        ps = con.prepareStatement(sql) ;
        ps.setString(1,pwd);
        ps.setString(2,username);
        return ps.executeUpdate() ;
    }

    /**
     * 添加班级信息
     * @param tclass
     * @throws SQLException
     * @return
     */
    @Override
    public int addClass(Tclass tclass) throws SQLException {
        //因为我们开启了事务，所以打开数据库在service中进行，此处就不要再打开数据库
        String sql = "insert into tclass (tclassname) values (?) ;" ;
        ps = con.prepareStatement(sql) ;
        ps.setString(1,tclass.getTclassname());
        ps.executeUpdate();
        sql = "select tclass_id from tclass where tclassname = ?;" ;
        ps = con.prepareStatement(sql);
        ps.setString(1,tclass.getTclassname());
        rs = ps.executeQuery();
        int cid = 0 ;
        while (rs.next()){
            cid = rs.getInt(1);
        }
        return cid;
    }

    /**
     * 添加班级信息
     * @param stu
     */
    @Override
    public int addStudent(Studentnew stu) throws SQLException {
        String sql = "insert into student (tclass_id,sname,age,enterday,score) values (?,?,?,?,?);";
        ps = con.prepareStatement(sql);
        //我们不可以通过以下方式来获取tclass的id值，因为此ID值在传参的时候是没有值，我们是在数据库中设置了自增长
        //ps.setInt(1,stu.getTclass().getTclass_id());
        //为了解决以上问题，我们需要获取到当前添加的班级ID值
//        int cid = getTclassid();
//        System.out.println("cid:" + cid);
        ps.setInt(1,stu.getTclass().getTclass_id());
        ps.setString(2,stu.getSname());
        ps.setInt(3,stu.getAge());
        //将util包下的date改为sql包下的date
        ps.setDate(4, new Date(stu.getEnterday().getTime()));
        ps.setDouble(5,stu.getScore());
        return ps.executeUpdate();
    }

    /**
     * 获取班级学生信息
     * @return
     */
    @Override
    public List<Tclass> getClassStudent() throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        openDb();
        String sql = "SELECT * FROM student INNER JOIN tclass ON student.tclass_id = tclass.tclass_id";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        List<Tclass> tclasses = new ArrayList<>();
        while (rs.next()){
            Tclass tclass = new Tclass();
            tclass.setTclass_id(rs.getInt(2));
            tclass.setTclassname(rs.getString(8));
            Studentnew stu = new Studentnew(tclass,rs.getString(3),rs.getInt(4),
                    rs.getDate(5),rs.getDouble(6));
            tclasses.add(tclass);
        }
        return tclasses;
    }

    /**
     * 获取到班级的ID值
     * @param
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int getTclassid() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        openDb();
        String sql = "select max(tclass_id) from tclass";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        int cid = 0;
        List list = new ArrayList();
        if (rs.next()){
            cid = rs.getInt(1);
            System.out.println(rs.getInt(1) + "-");
        }
        return cid;
    }

    //测试！
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        //Tclass tclass, String sname , int age , Date enterday , double score
//        Tclass tc = new Tclass("java2班");
//        Studentnew stu1 = new Studentnew(tc,"不困了" , 20 , new java.util.Date(),90.9);
        StudentDaoImpl sd = new StudentDaoImpl();
//        sd.addStudent(stu1);
        System.out.println(sd.getTclassid());
    }
}
