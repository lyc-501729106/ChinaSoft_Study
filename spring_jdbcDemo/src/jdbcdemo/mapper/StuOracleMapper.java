package jdbcdemo.mapper;

import jdbcdemo.entity.Student;

import java.util.List;

/**
 * @Author 吕译辰
 * @Date 2020/11/2 - 16:43
 */
public interface StuOracleMapper {
    //登录
    public Student login(String username, String pwd);
    //获取到所有的用户
    List<Student> getAll();
}
