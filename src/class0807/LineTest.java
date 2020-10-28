package class0807;
//线性表
public class LineTest {
    //定义一个Node类，用来表示节点
    private class Node{
        //为了更好地表示元素内容，使用key,value的方式
        private String  key ;
        private String value ;
        //定义下一个节点
        private Node next ;
        //添加构造方法，用来创建节点对的时候添加元素内容
        Node(String key , String value){
            this.key = key ;
            this.value = value ;
        }
    }
    //定义头节点
    private Node  head ;
    //添加节点的功能
    public void addNode(String key , String value){
        //判断头节点是否为空
        if (head == null) {
            //如果头节点为空，则将 当前元素内容添加到此头结点
            head = new Node(key , value) ;
        }else {
            //头结点不为空，则需要找到尾节点
            Node cur = head ;
            while(cur.next != null) {
                //只要当前节点指向不为空，则表示没有走到尾节点
                //将当前的节点指向下一个节点
                cur = cur.next ;
            }
            cur.next = new Node(key , value) ;
        }
    }
    //查看节点的功能
    public String selectNode(String key ){
        String value = null ;
        boolean flag = false ;
        if (head == null){
            return "没有此节点";
        }else {
            //头节点不为空
            Node cur = head ;
            while(cur != null){
                if (cur.key.equals(key)){
                    value = cur.value ;
                    flag = true ;
                    break ;
                }
                cur = cur.next ;
            }
            if (!flag){
                value = "没有此节点" ;
            }
        }
        return value ;
    }
    //修改的功能
    public void updataNode(String key ,String newvalue){
        String value = null ;
        if (head == null){
            System.out.println("没有此节点");
        }else{
            Node cur = head ;
            while(cur != null){
                if (cur.key.equals(key)){
                    cur.value = newvalue ;
                    break ;
                }
                cur = cur.next ;
            }
        }
    }

        public String delNode(String key, String value){
            Node cur = head ;
            String result = "";
                if(head == null){
                    result= "没有此结点";
                }else if(head.key.equals(key)){
                    head = head.next;//头结点下移
                }else{
                    while(cur != null){
                        if(cur.next.key.equals(key)){
                          cur.next = cur.next.next;
                          break ;
                        }
                        cur = cur.next ;
                    }
                }
            return result;
        }




    public static void main(String[] args) {
        //定义线性表的对象
        LineTest lineTest = new LineTest() ;

            //添加节点
            lineTest.addNode("1" ,"结点1");
            lineTest.addNode("2" ,"结点2");
            lineTest.addNode("3" ,"结点3");
            lineTest.addNode("4" ,"结点4");
            lineTest.addNode("5" ,"结点5");
            lineTest.addNode("6" ,"结点6");
            //修改节点value
//            lineTest.updataNode("2" , "你好") ;
            //删除节点

            System.out.println(lineTest.delNode("6" ,"结点6"));
            //查看节点
            System.out.println(lineTest.selectNode("1"));
            System.out.println(lineTest.selectNode("2"));
            System.out.println(lineTest.selectNode("3"));
            System.out.println(lineTest.selectNode("4"));
            System.out.println(lineTest.selectNode("5"));
            System.out.println(lineTest.selectNode("6"));


    }
}
