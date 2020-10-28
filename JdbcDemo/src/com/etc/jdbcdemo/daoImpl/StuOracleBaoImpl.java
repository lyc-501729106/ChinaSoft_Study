package com.etc.jdbcdemo.daoImpl;

import com.etc.jdbcdemo.dao.StudentDao;
import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Studentnew;
import com.etc.jdbcdemo.entity.Tclass;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuOracleBaoImpl extends BaseDaoImpl implements StudentDao {
    @Override
    public Student login(String username, String pwd) throws SQLException {
        System.out.println("数据库连接成功!");
        String sql = "select * from student where stuname = '" + username + "' and pwd = '" + pwd + "'";
        //使用Statement进行操作不需要预编译，需要先根据连接得到Statement对象
        st = con.createStatement();
        //执行SQL语句
        rs = st.executeQuery(sql);
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        Student stu = (Student) context.getBean("student");
        while (rs.next()) {
            System.out.println(rs.getString("stuname") + "---");
//            stu.setAge(rs.getInt("age")); //把查询的结果存进age
            stu.setPwd(rs.getString("pwd"));
            stu.setStuname(rs.getString("stuname"));
//            stu.setSid(rs.getInt("stu_id"));
        }
        return stu;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        //打开数据库
//        openDb();
        //SQL语句
        String sql = "select * from student";
        //使用Statement进行操作不需要预编译，需要先根据连接得到Statement对象
        st = con.createStatement();
        //执行SQL语句
        rs = st.executeQuery(sql);
        List<Student> students = new ArrayList<>();
        Student stu = null;
        while (rs.next()) {
            stu = new Student();
            stu.setSid(rs.getInt(1));
            stu.setStuname(rs.getString(6));
            stu.setAge(rs.getInt(4));
            stu.setPwd(rs.getString(7));
            students.add(stu);
        }
        return students;
    }

    @Override
    public int regist(Student stu) throws SQLException {
        String sql = "insert into student (stuname , age , pwd) values ('" + stu.getStuname() + "' , '" + stu.getAge() + "' , '" + stu.getPwd() + "')";
        st = con.createStatement();
        int no = st.executeUpdate(sql);
        return no;
    }

    @Override
    public int del(String username) throws SQLException {
        String sql = "delete from student where stuname = '" + username + "'";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    @Override
    public int update(String username, String pwd) throws SQLException {
        String sql = "update student set pwd = '" + pwd + "'  where stuname = '" + username + "'";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    @Override
    public int addClass(Tclass tclass) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        String sql = "insert into class(cla_id,cla_name) values(clasequence.nextval,'" + tclass.getTclassname() + "')";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    @Override
    public int addStudent(Studentnew stu) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        String sql = "insert into student(stu_id,stu_name,stu_age,stu_score,cla_id) values (stusequence.nextval,'" + stu.getSname() + "','" + stu.getAge() + "','" + stu.getScore() + "',clasequence.currval)";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    public int delStudent() throws SQLException {
        String sql = "delete  from student where cla_id = (select max(cla_id) from class)";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    public int delClass() throws SQLException {
        String sql = "delete from class where cla_id = (select max(cla_id) from class)";
        st = con.createStatement();
        return st.executeUpdate(sql);
    }

    @Override
    public List<Tclass> getClassStudent() throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        return null;
    }
}
