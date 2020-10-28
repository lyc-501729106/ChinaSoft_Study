package class0805.home;
//消费者
public class FruitsConsumer extends Thread {
    public FruitsRepository fruitsRepository ;
    String fruits ;
    public FruitsConsumer(){}
    public FruitsConsumer(FruitsRepository fruitsRepository){
        this.fruitsRepository = fruitsRepository ;
    }

    @Override
    public void run() {
        while (true){
            fruits = fruitsRepository.fruitConsumer() ;
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (fruits == null) break;
        }
    }
}
