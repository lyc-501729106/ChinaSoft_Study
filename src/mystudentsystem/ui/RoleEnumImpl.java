package mystudentsystem.ui;

import mystudentsystem.serviceImpl.StudentServiceFansheImpl;
import mystudentsystem.util.Id;
import mystudentsystem.util.JudgeCount;
import mystudentsystem.util.JudgeEmail;
import mystudentsystem.util.JudgeNo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public enum  RoleEnumImpl implements RoleEnum{
    班长{
        @Override
        public void roleMenu() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
            Scanner input = new Scanner(System.in) ;
            JudgeNo nextInt = new JudgeNo() ;
            StuInfo si = new StuInfo() ;
            JudgeCount jc = new JudgeCount() ;
            System.out.println("我是班长");
            int j = 1;
            while (j <= jc.count()){
                System.out.print("请输入用户名：");
                String  uname = input.next();
                System.out.print("请输入密码：");
                String pwd = input.next();
                StudentServiceFansheImpl ss = new StudentServiceFansheImpl() ;
                if (uname != null && !"".equals(uname)) // 判空
                    if (ss.login(uname , pwd) ){
                        System.out.println("登录成功！");
                        System.out.println("欢迎你  " + uname + "!");
                        while (true){
                            infoMenu();
                            System.out.print("请输入你的选择：");
                            int a = nextInt.judge();
                            if (a == 0 ) break;
                            switch (a){
                                case 1 :
                                    si.infoInsert();//插入名字
                                    break;
                                case 2 :
                                    si.infoUpdate(); //修改名字
                                    break;
                                case 3 :
                                    si.infoSelect();//查询名字
                                    break;
                                case 4 :
                                    si.infoDel();   //删除名字
                                    break;
                                case 5 :
                                    new Id().numId(); //随机16位ID生成
                                    break;
                                case 6 :
                                    //邮箱校验
                                    System.out.print("请输入你的邮箱：");
                                    String email = input.next() ;
                                    System.out.println(new JudgeEmail().email(email) ? "格式正确！" :"格式错误！");
                                    break ;
                                default:
                                    System.out.println("输入无效！");
                                    break;
                            }
                        }
                        break; // 退回登录页
                    }else {
                        int b = 3 - j ;
                        j++ ;
                        System.out.println("你还有" + b + "次机会");
                        if (j == 4 ){
                            System.out.println("你已经错了3次，自动退出");
                            break;
                        }
                    }
            }
        }
        public void infoMenu(){
            System.out.println("--------------------------");
            System.out.println("|      1.存储一个名字     |");
            System.out.println("|      2.修改一个名字     |");
            System.out.println("|      3.查询一个名字     |");
            System.out.println("|      4.删除一个名字     |");
            System.out.println("|     5.随机16位ID生成    |");
            System.out.println("|        6.邮箱校验       |");
            System.out.println("|          0.退出        |");
            System.out.println("--------------------------");
        }

    } ,
    组长{
        @Override
        public void roleMenu() {
            System.out.println("我是组长");
            infoMenu();
        }
        public void infoMenu(){
            System.out.println("--------------------------");
            System.out.println("|                        |");
            System.out.println("|      组长界面           |");
            System.out.println("|                        |");
            System.out.println("--------------------------");
        }
    } ,
    组员{
        @Override
        public void roleMenu() {
            System.out.println("我是组员");
            infoMenu();
        }
        public void infoMenu(){
            System.out.println("--------------------------");
            System.out.println("|                        |");
            System.out.println("|      组员界面           |");
            System.out.println("|                        |");
            System.out.println("--------------------------");
        }
    };

}
