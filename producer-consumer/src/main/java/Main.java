import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of pairs:");
        int num = sc.nextInt();

        // 用于储存生产和消费之间的状态
        PairState state = new PairState();
        Thread conThread = new ConsumerThread(num,state);
        Thread proThread = new ProducerThread(num,state,sc);
    }
}
