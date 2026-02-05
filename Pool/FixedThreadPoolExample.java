package Pool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args){
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Runnable task=()->{
            System.out.println("Task в " + Thread.currentThread().getName());
        };
        for(int i=1; i<=6; i++){
            int taskNumber =i;
            pool.submit(()->{
                System.out.println("Task "+taskNumber + " выполняется потоком "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            });

        }
        pool.shutdown();
    }
}
