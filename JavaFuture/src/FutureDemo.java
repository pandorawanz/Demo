import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Future {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool(); // 线程池
        Future<Integer> result = executor.submit(()-> {             // Lambda
            Random rand = new Random();
            for (int i = 0; i < 10000; i++) {
                rand.nextInt();
            }
            Thread.sleep(5000);
            return rand.nextInt();
                });


    }
}
