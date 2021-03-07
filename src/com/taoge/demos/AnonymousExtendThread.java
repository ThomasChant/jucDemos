package com.taoge.demos;

/**
 * CreateThread
 *
 * @author chentao
 * @date 2021/2/26
 */
public class AnonymousExtendThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("我是线程t1");
            }
        };
        t1.start();
    }

}
