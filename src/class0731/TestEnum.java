package class0731;

public class TestEnum {
    public static void main(String[] args) {
        //enum的每一个元素都是枚举类型
        EatEnu ee = EatEnu.海鲜 ;
        Student stu = new Student() ;
        stu.setEatEnum(EatEnu.火锅);
        System.out.println(stu.getEatEnum());
    }
}
