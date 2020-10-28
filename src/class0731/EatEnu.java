package class0731;

public enum EatEnu {
     烧烤("烧烤 " , 1) , 肉("肉3" , 2) ,火锅("火锅" , 3) ,海鲜("海鲜" , 4) ;
    private String name ;
    private int index ;

    private EatEnu(String name , int index){
        this.name = name ;
        this.index = index ;
    }
    //定义一个静态方法用来遍历枚举
    public static String getName(int index){
        for (EatEnu e : EatEnu.values()){
            //判断index的值是否在枚举的元素中
            if (e.index == index){
                return e.name ;
            }
        }
        return "没有这道菜" ;
    }

    public static void main(String[] args) {
        System.out.println(getName(2));
    }
}
