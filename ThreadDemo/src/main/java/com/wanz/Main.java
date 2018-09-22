package com.wanz;

public class Main {
    // 主线程逻辑
    public static void main(String args[]) throws InterruptedException{
        Thread t = Thread.currentThread();  // 获取当前线程对象，这里是主线程
        // 在Java语言语法层面，简称就是一个Thread类的对象

        System.out.println("Current Thread:" + t);
        // change the name of the thread
        t.setName("My Thread");
        System.out.println("Thread ID:" + t.getId());
        System.out.println("After setName:" + t);
        new NewThread();
        new RunnableThread("RunThread");
        // 调用完构造方法，start()后，子线程开始执行，主线程返回到main()方法，继续执行下面代码
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main Thread:" + n);
                Thread.sleep(1000);
                // 暂停执行1s
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exiting.");
    }


}
