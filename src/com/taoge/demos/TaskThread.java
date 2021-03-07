package com.taoge.demos;

/**
 * CreateThread
 *
 * @author chentao
 * @date 2021/2/26
 */
public class TaskThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("通过");
            }
        };
        Thread t = new Thread();
        t.start();
    }
}
