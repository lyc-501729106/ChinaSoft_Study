package class0730;

import java.util.Arrays;

public class TestRole {
    public static void main(String[] args) {
        if ("管理员".equals(Role.MANAGER)){
            System.out.println("是管理员");

        }
        //测试枚举的实现方式
        RoleEnum a = RoleEnum.VIP;
        System.out.println(RoleEnum.VIP);
        if ("VIP".equals(a.VIP.toString())){
            System.out.println("VIP");
        }
    }
}
