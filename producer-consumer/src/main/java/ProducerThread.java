import java.util.Scanner;

// 生产线程
public class ProducerThread extends Thread{
    private int num;
    private PairState state;
    Scanner sc;

    public ProducerThread(int num, PairState state, Scanner sc) {
        this.num = num;
        this.state = state;
        this.sc = sc;
        start();
    }

    public void run() {
        for(int i = 0; i < num; i++) {
            state.put(sc.nextInt());
        }
    }
}
