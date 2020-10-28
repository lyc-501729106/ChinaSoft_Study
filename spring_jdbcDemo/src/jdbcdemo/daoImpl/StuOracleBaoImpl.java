package jdbcdemo.daoImpl;

import jdbcdemo.dao.StudentDao;
import jdbcdemo.entity.Student;
import jdbcdemo.entity.Studentnew;
import jdbcdemo.entity.Tclass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.applet.AppletContext;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuOracleBaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student login(String username, String pwd) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        return this.jdbcTemplate.queryForObject(" select * from student where stuname = ? and pwd = ? ",
                new Object[]{username, pwd},
                new RowMapper<Student>() {
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student stu = (Student) context.getBean("student");
                        stu.setPwd(rs.getString("pwd"));
                        stu.setStuname(rs.getString("stuname"));
                        return stu;
                    }
                });
    }

    @Override
    public List<Student> getAll() throws SQLException {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("jdbc.xml");
        return this.jdbcTemplate.query(" select * from student ",
                new RowMapper<Student>() {
                    @Override
                    public Student mapRow(ResultSet rs, int i) throws SQLException {
                        Student stu = (Student) context.getBean("student");
                        stu.setSid(rs.getInt(1));
                        stu.setStuname(rs.getString("stuname"));
                        stu.setAge(rs.getInt("stu_age"));
                        stu.setPwd(rs.getString("pwd"));
                        return stu;
                    }
                });
    }

    @Override
    public int regist(Student stu) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        return 0;
    }

    @Override
    public int del(String username) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        return 0;
    }

    @Override
    public int update(String username, String pwd) throws SQLException, ClassNotFoundException, IOException, URISyntaxException {
        return 0;
    }

    @Override
    public int addClass(Tclass tclass) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public int addStudent(Studentnew stu) throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public List<Tclass> getClassStudent() throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        return null;
    }

}
