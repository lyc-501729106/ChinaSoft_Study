package jdbcdemo.daoImpl;

import jdbcdemo.dao.StudentDao;
import jdbcdemo.entity.Student;
import jdbcdemo.entity.Studentnew;
import jdbcdemo.entity.Tclass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student login(String username, String pwd) throws ClassNotFoundException, SQLException, IOException, URISyntaxException {
        return null;
    }

    /**
     * 查询所有学生信息
     *
     * @return
     */
    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public int regist(Student stu) {
        return this.jdbcTemplate.update(" insert into student (stuname , stu_age , pwd,STU_ID) values (? , ? , ?,stu_id.nextval) ",
                stu.getStuname(), stu.getAge(), stu.getPwd());
    }

    @Override
    public int del(String username) {
        return this.jdbcTemplate.update(" delete from student where stuname = ? ",
                username);
    }

    @Override
    public int update(String username, String pwd) {
        return this.jdbcTemplate.update(" update student set pwd = ? where stuname = ? ",
                pwd, username);
    }

    /**
     * 添加班级信息
     *
     * @param tclass
     * @return
     * @throws SQLException
     */
    @Override
    public int addClass(Tclass tclass) throws SQLException {
        return 0;
    }

    /**
     * 添加班级信息
     *
     * @param stu
     */
    @Override
    public int addStudent(Studentnew stu) throws SQLException {
        return 0;
    }

    /**
     * 获取班级学生信息
     *
     * @return
     */
    @Override
    public List<Tclass> getClassStudent() throws ClassNotFoundException, SQLException, URISyntaxException, IOException {
        return null;
    }

    /**
     * 获取到班级的ID值
     *
     * @param
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int getTclassid() throws SQLException, URISyntaxException, IOException, ClassNotFoundException {
        return 0;
    }
}
