package com.taoge.demos;

/**
 * CreateThread
 *
 * @author chentao
 * @date 2021/2/26
 */
public class LambdaRunnableThread {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> System.out.println("我是线程t2"));
        t2.start();
    }
}
