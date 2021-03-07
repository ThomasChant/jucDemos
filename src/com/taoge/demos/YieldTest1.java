package com.taoge.demos;

import java.util.logging.Logger;

/**
 * YieldTest
 *
 * @author chentao
 * @date 2021/3/4
 */
public class YieldTest1 {
    static Logger logger = Logger.getLogger("YieldTest");
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (true){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        },"t1").start();
        new Thread(()->{
            while (true){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        },"t2").start();
    }
}
