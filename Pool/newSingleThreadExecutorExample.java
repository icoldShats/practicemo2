package Pool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class newSingleThreadExecutorExample {
    public static void main(String[] args){
        ExecutorService pool=Executors.newSingleThreadExecutor();
        for(int i=1;i<=3;i++){
            int time = i;
            pool.submit(()->{
                System.out.println("Задача " + time + " выполняется потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // имитация работы
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        pool.shutdown();
    }
}
