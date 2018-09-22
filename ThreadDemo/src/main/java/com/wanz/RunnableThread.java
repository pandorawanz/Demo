package com.wanz;

import static java.lang.Thread.sleep;

public class RunnableThread implements Runnable{
    private Thread t;

    RunnableThread(String name) {

        // t得有个名字
        t = new Thread(this,name);
        System.out.println("RunnableThread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("RunThread:" + i);
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("RunThread interrupted");
        }
        System.out.println("RunThread exiting");
    }
}
