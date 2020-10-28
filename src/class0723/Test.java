package class0723;

public class Test {
    public static void main(String[] args) {
        System.out.println("判断输入的是否是数字！");
        int no = JudgeNo.judge();
        if (no > 100 || no < 0){
            System.out.println("请输入0到100之间的数字");
            no = JudgeNo.judge();
        }
    }
}
