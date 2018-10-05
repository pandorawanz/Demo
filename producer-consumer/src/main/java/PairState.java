public class PairState {
    // 仓库
    private int n;
    private boolean valueSet = false;

    // 消费者
    public synchronized int get() {
        // value 还没被设置好
        if (!valueSet) {
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }
        System.out.println("Got:" + n);
        // 标记已经取走了值
        valueSet = false;
        // 通知put()可以设置另外一个值
        notify();
        return n;
    }

    // 生产者
    public synchronized void put(int n) {
        // 如果这个值已经设置好了
        if (valueSet) {
            try {
                // 等到get() 把值取走
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught.");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put:"+n);
        notify();
    }
}
