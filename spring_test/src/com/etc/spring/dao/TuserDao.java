package com.etc.spring.dao;

import com.etc.spring.entity.Student;
import com.etc.spring.service.TuserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/10/28 - 10:39
 */
public class TuserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addUser() {
        this.jdbcTemplate.update(" insert into STUDENT (stu_id,STUNAME) values (?,?) ", new Object[]{4, "aaa"});
    }

    public void updateUser(String newname, int stuid) {
        this.jdbcTemplate.update(" update STUDENT set STUNAME = ? where  STU_ID = ?  ", newname, stuid);
    }

    public void delstu(int stuid) {
        this.jdbcTemplate.update(" delete STUDENT where STU_ID = ? ", new Object[]{stuid});
    }

    /**
     * 查询一条信息
     * @return
     */
    public Student seletStu() {
        Student student = this.jdbcTemplate.queryForObject(
                " select * from STUDENT  WHERE STU_ID = ? ",
                new Object[]{1},
                new RowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                        Student student1 = new Student();
                        student1.setStuid(resultSet.getInt(1));
                        student1.setStuname(resultSet.getString("STUNAME"));
                        return student1;
                    }
                }
        );
        return student;
    }

    /**
     * 查询多条信息
     * @return
     */
    public List<Student> students() {
        return this.jdbcTemplate.query(
                " select * from STUDENT  WHERE stuname = ?  ",
                new Object[]{123},
                new RowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                        Student student1 = new Student();
                        student1.setStuid(resultSet.getInt(1));
                        student1.setStuname(resultSet.getString("stuname"));
                        return student1;
                    }
                }
        );
    }
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com/etc/spring/jdbc.xml");
        TuserService ts = (TuserService) context.getBean("tuserService");
        List<Student> students = ts.students();
        for (Student stus :
                students) {
            System.out.println("stuname: " + stus.getStuname());
            System.out.println(stus.getStuid());
        }
    }
}
