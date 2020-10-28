package com.etc.jdbcdemo.serviceImpl;

import com.etc.jdbcdemo.dao.StudentDao;
import com.etc.jdbcdemo.daoImpl.StuOracleBaoImpl;
import com.etc.jdbcdemo.daoImpl.StudentDaoImpl;
import com.etc.jdbcdemo.entity.Student;
import com.etc.jdbcdemo.entity.Studentnew;
import com.etc.jdbcdemo.entity.Tclass;
import com.etc.jdbcdemo.service.StudentService;
import com.etc.jdbcdemo.util.Log;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    /**
     * 添加班级
     */
    public int addClass(Studentnew stu) throws SQLException {
        StudentDao dao = new StuOracleBaoImpl();
        int no = 0;
        try {
            ((StuOracleBaoImpl)dao).openTransaction();
            //添加班级信息
            no = dao.addClass(stu.getTclass());
            ((StuOracleBaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            ((StuOracleBaoImpl) dao).rollbackTransaction();
            e.printStackTrace();
        } finally {
            ((StuOracleBaoImpl) dao).closeResource();
        }
        return no;
    }
    /**
     * 添加学生班级信息
     */
    public int addStudentClass(Studentnew stu) throws SQLException{
        StudentDao dao = new StuOracleBaoImpl();
        int no = 0;
        try {
            ((StuOracleBaoImpl)dao).openTransaction();
            //添加班级信息
            dao.addClass(stu.getTclass());
            //添加学生信息
            no = dao.addStudent(stu);
            ((StuOracleBaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            ((StuOracleBaoImpl) dao).rollbackTransaction();
            e.printStackTrace();
        } finally {
            ((StuOracleBaoImpl) dao).closeResource();
        }
        return no;
    }
    public int delStudentClass() throws SQLException {
        StudentDao dao = new StuOracleBaoImpl();
        int no = 0;
        int no1 = 0;
        int no2 = 0;
        try {
            ((StuOracleBaoImpl)dao).openTransaction();
            no2 = ((StuOracleBaoImpl) dao).delStudent();
            no1 = ((StuOracleBaoImpl) dao).delClass();
            ((StuOracleBaoImpl) dao).commitTransaction();
        } catch (Exception e) {
            ((StuOracleBaoImpl) dao).rollbackTransaction();
            e.printStackTrace();
        } finally {
            ((StuOracleBaoImpl) dao).closeResource();
        }
        if (no1 > 0 && no2 > 0) no = 1;
        return no;
    }
    /**
     * 添加班级学生信息
     */
    public int addClassStudent(Tclass tclass) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        int no = 0;
        try {
            //打开事务
            ((StudentDaoImpl)dao).openTransaction();
            //添加班级信息
            int cid = dao.addClass(tclass);
            tclass.setTclass_id(cid);
            //添加学生信息
            List<Studentnew> studentnews = tclass.getStudentnewList();
            for (Studentnew stu :
                    studentnews) {
                no = dao.addStudent(stu);
                System.out.println("no:" + no);
                //提交事务
                ((StudentDaoImpl)dao).commitTransaction();
            }
        } catch (Exception e) {
            //回滚事务
            ((StudentDaoImpl)dao).rollbackTransaction();
            Log.mylog.debug("添加班级学生信息:" + e.getMessage());
            e.printStackTrace();
        } finally {
            //关闭资源
            ((StudentDaoImpl)dao).closeResource();
        }
        return no;
    }
    /**
     * 完成登录功能
     * @param username
     * @param pwd
     * @return Student
     */
    @Override
    public Student login(String username, String pwd) throws SQLException {
        StudentDao dao1 = new StuOracleBaoImpl() ;
        Student stu = null ;
        try {
            ((StuOracleBaoImpl)dao1).openTransaction();
            stu = dao1.login(username , pwd) ;
            ((StuOracleBaoImpl) dao1).commitTransaction();
        } catch (Exception e) {
            //当有程序异常的时候才会写入日志
            //Logger.getLogger(StudentServiceImpl.class).debug("登录异常" + e.getMessage()); ;
            Log.mylog.debug("登录异常！" + e.getMessage());
            e.printStackTrace();
            ((StuOracleBaoImpl) dao1).rollbackTransaction();
        } finally {
            //关闭资源
            ((StuOracleBaoImpl) dao1).closeResource();
        }
        return stu;
    }

    /**
     * 实现查询所有学生信息
     * @return
     */
    @Override
    public List<Student> getAll() throws SQLException {
        StudentDao dao = new StudentDaoImpl() ;
        StudentDao dao1 = new StuOracleBaoImpl();
        List<Student> students = null ;
        try {
            ((StuOracleBaoImpl)dao1).openTransaction();
            students = dao1.getAll() ;
            ((StuOracleBaoImpl) dao1).commitTransaction();
//            students = dao.getAll() ;
        } catch (Exception e) {
            //日志
            Log.mylog.debug(e.getMessage());
            e.printStackTrace();
            ((StuOracleBaoImpl) dao1).rollbackTransaction();
        } finally {
            //关闭资源
            ((StuOracleBaoImpl) dao1).closeResource();
//            ((StudentDaoImpl) dao).closeResource();
        }
        return students;
    }

    /**
     * 实现注册的功能
     */
    @Override
    public int regist(Student stu) throws SQLException, ClassNotFoundException {
        StudentDao dao1 = new StuOracleBaoImpl() ;
        int temp = 0 ;
        try{
            ((StuOracleBaoImpl)dao1).openTransaction();
            temp = dao1.regist(stu) ;
            ((StuOracleBaoImpl) dao1).commitTransaction();
        }catch(Exception e){
            e.printStackTrace();
            ((StuOracleBaoImpl) dao1).rollbackTransaction();
        }finally {
            //关闭资源
            ((StuOracleBaoImpl) dao1).closeResource();
        }
        return temp ;
    }

    @Override
    public int del(String username) throws SQLException {
        StudentDao dao1 = new StuOracleBaoImpl() ;
        int num = 0 ;
        try{
            ((StuOracleBaoImpl)dao1).openTransaction();
            num = dao1.del(username) ;
            ((StuOracleBaoImpl) dao1).commitTransaction();
        }catch(Exception e){
            e.printStackTrace();
            ((StuOracleBaoImpl) dao1).rollbackTransaction();
        }finally {
            //关闭资源
            ((StuOracleBaoImpl) dao1).closeResource();
        }
        return num;
    }

    @Override
    public int update(String username, String pwd) throws SQLException {
        StudentDao dao1 = new StuOracleBaoImpl();
        int num = 0 ;
        try{
            ((StuOracleBaoImpl)dao1).openTransaction();
            num = dao1.update(username, pwd) ;
            ((StuOracleBaoImpl) dao1).commitTransaction();
        }catch(Exception e){
            e.printStackTrace();
            ((StuOracleBaoImpl) dao1).rollbackTransaction();
        }finally {
            //关闭资源
            ((StuOracleBaoImpl) dao1).closeResource();
        }
        return num;
    }

    @Override
    public List<Tclass> getClassStudent() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        List<Tclass> tclasses = null ;
        try {
            tclasses = dao.getClassStudent();
        } catch (Exception e) {
            e.printStackTrace();
            Log.mylog.debug(e.getMessage());
        } finally {
            ((StudentDaoImpl)dao).closeResource();
        }
        return tclasses;
    }
}
