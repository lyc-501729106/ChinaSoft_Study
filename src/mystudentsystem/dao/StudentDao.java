package mystudentsystem.dao;

import mystudentsystem.entity.Student;

public interface StudentDao {



    public boolean insertName(Student student) ;
    public boolean selectName(String name) ;
    public boolean delName(String name ) ;
    public String regist(Student student) ;
    public boolean login(String uname ,String pwd) ;
    public boolean updataName(String name,Student student) ;
}
