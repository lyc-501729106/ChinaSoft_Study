package class0810;



public class MapTest <K , V>{
    public static void main(String[] args) {
        //  Map map = new HashMap()  ;
    }
    //定义一个当前数组的长度值
    int capacticy ;//此长度值会根据添加的结点数而变动
    // 定义当前MapTest的长度，即表示能够存储的结点的数量，也可以说是存储容量
    int size ;
    //定义每个位置对应的链表集（即存放多个链结点的数组）
    Entry<K , V>  []  entries ;
    //设置一个默认值：每一个地址可以链接的结点的数量
    public static int DEFAULTSIZE = 16 ;
    //配置一个装载因子，用来计算存储的最大容量
    public static float yinzi = 0.75f ;
    //存储的最大量
    public int max ;
    //创建无参构造方法
    public  MapTest(){
        //装载因子的确定
        this(DEFAULTSIZE , yinzi) ;
    }

    /**
     *
     * @param size  表示规定好当前的map可以存储的结点数量
     * @param yinzi 想要修改的装载因子数
     */
    public MapTest(int size , float yinzi){
        //判断长度是否小于0
        if(size < 0){
            new IllegalArgumentException("小于0的数我不知道如何来创建数组啊！！！！") ;
        }
        //判断装载因子的数据是否合法
        if( yinzi < 0 || Float.isNaN(yinzi)){
            new IllegalArgumentException("装载因子不合法啊") ;
        }
        //我们在这里去掉了之前写的超出default值的时候的判断，源码中是进行数据存储操作，我们并没有模拟那个功能
        // 所以我们只需要将size传递给当前对象的size属性即可
        this.yinzi = yinzi ;
        this.size = size ;//将客户给的size值传递给当前mapTest对象的size
        max = (int)(size * yinzi) ;
        // 创建结点数组
        entries = new Entry[size] ;

    }
    //得到结点的存储位置
    /**
     * @param hash 结点的哈希值
     * @param compaticy  数组的长度
     * @return
     */
    public int indexOf(int hash , int compaticy){
        //自己定义了一个计算位置的算法
        return hash & (compaticy - 1) ;
    }
    /**
     * 实现添加结点的功能
     * @param key 添加元素的key值
     * @param value 添加元素的value值
     */
    public boolean put(K key , V value){
        //根据元素的key值得到元素的hash值：这是一种计算哈希地址的算法
        int hash = key.hashCode() ;
        //因为需要返回布尔类型的数据，所以需要定义一个布尔类型的数据
        boolean flag = false ;
        //创建新的Entry结点
        Entry<K , V> newEntry = new Entry<>(key , value ,hash) ;
        //因为我们要根据是否正常添加来修改当前数组的容量,所以调用添加的方法，进行添加
        if(setEntry(newEntry , entries )){
            capacticy++ ;
            flag = true ;
        }
        return flag ;
    }

    /**
     * 实现结点添加功能
     * @param newEntry
     * @param entries
     * @return
     */
    private boolean setEntry(Entry<K,V> newEntry, Entry<K,V>[] entries) {
        //定义一个标识，表示可以添加此结点为true
        boolean flag = true ;//当此值设置为false的时候，一定要注意，要有一个int变量可以得到循环的次数，才可以使用，因为这样是可以判断循环是否从头执行到尾
        //计算需要添加的结点的位置
        int index = indexOf(newEntry.hash , entries.length) ;
        //获取到当前位置的首结点
        Entry<K , V> temp = entries[index] ;
        //判断首结点是否为空
        if(temp != null){
            //判断需要添加的结点数组中是否已经有了，如果没有添加到当前数组的头结点的位置
            while(temp != null){
                if((newEntry.key.equals(temp.key) || newEntry.key == temp.key) && (newEntry.value.equals(temp.value) || newEntry.value == temp.value) &&
                        newEntry.hash == temp.hash){
                    flag = false ;
                    break ;
                }else if( (newEntry.key != temp.key ) && (newEntry.value != temp.value)){
                    temp = temp.next ;//如果可以添加此结点，则继续寻找尾结点
                }
            }
            //循环结束找到尾结点temp,将新的结点添加到尾结点的后面
            if(flag)
                addLastEntry(temp , newEntry) ;

        }else{
            //此条件表示头结点为空，则直接将结点添加到首位置即可
            if(flag){
                addFirstEntry(temp , entries) ;
            }

        }
        return  flag ;
    }

    private void addFirstEntry(Entry<K,V> temp, Entry<K,V>[] newEntry) {
        if(capacticy > max){
            reSize(size * 4);
        }
        newEntry[0] = temp ;
        temp.next = null ;
    }

    /**
     *
     * @param temp
     * @param newEntry
     */
    private void addLastEntry(Entry<K,V> temp, Entry<K,V> newEntry) {
        //判断是否需要扩容操作
        if(capacticy > max){
            //当添加的元素个数超出max值的时候，我们就开始准备扩容
            reSize(size * 4) ;
        }
        temp.next = newEntry  ;
    }

    /**
     * 扩容
     * @param i
     */
    private void reSize(int i) {
        //因为扩容，所以max的值是需要修改的
        max = (int)( i * yinzi );
        //扩容后将会有一个新的数组，所以先定义一个新的数组
        Entry<K , V>[] newtale = new Entry[i] ;
        //将之前数组中的所有的值传递给新的数组
        for (int j = 0; j < entries.length ; j++) {
            newtale[j] = entries[j] ;
           /*
        Entry<K , V> entry = entries[j] ;
        setEntry(entry , newtale) ;*/
        }
        entries = newtale ;
    }


}
//定义一个内部类，用来表示链表的结点
class Entry<K , V>{
    //表示下一个结点的属性
    Entry<K , V> next ;
    //分别表示key和value的两个属性
    K key ;
    V value ;
    //用来表示存储地址的哈希值
    int hash ;
    //创建构造方法
    public  Entry(){

    }
    public Entry(K key , V value , int hash){
        this.key = key ;
        this.value = value ;
        this.hash = hash ;
    }
}
