package jdbcdemo.serviceImpl;

import jdbcdemo.dao.StudentDao;
import jdbcdemo.daoImpl.StuOracleBaoImpl;
import jdbcdemo.daoImpl.StudentDaoImpl;
import jdbcdemo.entity.Student;
import jdbcdemo.entity.Studentnew;
import jdbcdemo.entity.Tclass;
import jdbcdemo.mapper.BaseDao;
import jdbcdemo.mapper.StuOracleMapper;
import jdbcdemo.service.StudentService;
import jdbcdemo.util.Log;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDaoImpl studentDao;
    private StuOracleBaoImpl stuOracleBao;

    public StudentDaoImpl getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    public StuOracleBaoImpl getStuOracleBao() {
        return stuOracleBao;
    }

    public void setStuOracleBao(StuOracleBaoImpl stuOracleBao) {
        this.stuOracleBao = stuOracleBao;
    }

    /**
     * 完成登录功能
     *
     * @param username
     * @param pwd
     * @return Student
     */
    @Override
    public Student login(String username, String pwd) throws SQLException {
        Student stu = null;
        /*try {
            stu = stuOracleBao.login(username, pwd);
        } catch (Exception e) {
            //当有程序异常的时候才会写入日志
            //Logger.getLogger(StudentServiceImpl.class).debug("登录异常" + e.getMessage()); ;
            Log.mylog.debug("登录异常！" + e.getMessage());
            e.printStackTrace();
        }*/
        /**
         *用mybatis来连接数据库
         */
        BaseDao baseDao = new BaseDao();
        baseDao.open();
        StuOracleMapper stuOracleMapper = baseDao.sqlSession.getMapper(StuOracleMapper.class);
        stu = stuOracleMapper.login(username, pwd);
        baseDao.closeResource();
        return stu;
    }

    /**
     * 实现查询所有学生信息
     *
     * @return
     */
    @Override
    public List<Student> getAll() throws SQLException {
        List<Student> students = null;
        /*try {
            students = stuOracleBao.getAll();
        } catch (Exception e) {
            //日志
            Log.mylog.debug(e.getMessage());
            e.printStackTrace();
        }*/
        //用mybatis来 连接数据库
        BaseDao baseDao = new BaseDao();
        baseDao.open();
        StuOracleMapper stuOracleMapper = baseDao.sqlSession.getMapper(StuOracleMapper.class);
        students = stuOracleMapper.getAll();
        baseDao.closeResource();
        return students;
    }

    /**
     * 实现注册的功能
     */
    @Override
    public int regist(Student stu) {
        int temp = 0;
        for (int i = 8; i < 13; i++) {
            if (i == 10) throw new RuntimeException();
            temp = studentDao.regist(stu);
        }

        return temp;
    }

    @Override
    public int del(String username) throws SQLException {
        int num = 0;
        try {
            num = studentDao.del(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    @Override
    public int update(String username, String pwd) {
        int num = 0;
        try {
            num = studentDao.update(username, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }
}
