package com.wanz;

public class NewThread extends Thread{
    NewThread() {
        // Create a new, second thread
        super();
        System.out.println("Child thread:"+ this);
        // 显示地开始执行这个线程
        start(); //Start the thread
    }

    /*
    public void startThread(){
        System.out.println("Child Thread start:");
        start();
    }
    */

    // This is the entry point for the second thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Child Thread exiting.");
    }
}
