package class0805.home;
//生产者
public class FruitsProduct extends Thread{
    public FruitsRepository fruitsRepository ;
    public FruitsProduct(){}
    public FruitsProduct(FruitsRepository fruitsRepository){
        this.fruitsRepository = fruitsRepository ;
    }

    @Override
    public void run() {
        String[] fruit = new String[6] ;
        fruit[0] = "苹果" ;
        fruit[1] = "香蕉" ;
        fruit[2] = "梨" ;
        fruit[3] = "西瓜" ;
        fruit[4] = "火龙果" ;
        fruit[5] = "桃子" ;
        for (int i = 0; i < fruit.length; i++) {
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fruitsRepository.fruitProduct(fruit[i]);
        }
    }
}
