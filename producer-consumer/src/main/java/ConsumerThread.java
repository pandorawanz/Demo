// 消费线程
public class ConsumerThread extends Thread{
    private int num;
    private PairState state;

    public ConsumerThread(int num ,PairState state) {
        this.num = num;
        this.state = state;
        start();
    }

    public void run() {
        for (int i = 0; i < num; i++) {
            state.get();
        }
    }
}
