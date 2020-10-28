package mystudentsystem.ui;


import mystudentsystem.daoImpl.StudentDaoFansheImpl;
import mystudentsystem.util.JudgeNo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class UI {
    public void start() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, IOException, ClassNotFoundException {
        StudentDaoFansheImpl studao = new StudentDaoFansheImpl() ;
        studao.seriIn(); //将文件中的数据重新给数组
        Menu menu = new Menu() ;
        //校验是否为数字
        JudgeNo nextInt = new JudgeNo() ;
        while (true){
            menu.startMenu();
            System.out.print("请输入你的选择：");
            int a = nextInt.judge();//校验数字
            if (a == 3){
                try {
                    studao.seriOut(); //将数组中的信息存入文件中
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("系统已退出！");
                break;
            }
            switch (a){
                case 1 :
                    menu.startLogin();     //登录页
                    break;
                case 2 :
                    menu.startRegist(); //注册页
                    break;
                default:
                    System.out.println("输入无效！");
                    break;
            }


        }
    }

}
