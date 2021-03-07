package com.taoge.demos;

import java.util.logging.Logger;

/**
 * YieldTest
 *
 * @author chentao
 * @date 2021/3/4
 */
public class YieldTest {
    static Logger logger = Logger.getLogger("YieldTest");
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[5];
        Runnable r = ()->{
            String name = Thread.currentThread().getName();
            System.out.println(name +"准备买票");
            if("绅士".equals(name)){
                System.out.println(name +"让别人先买");
                Thread.yield();
            }
            System.out.println(name +"买了一张票");
        };
        for (int i = 0; i < 5; i++) {
            String name = "买票人"+i;
            if(i==3){
                name = "绅士";
            }
            ts[i] = new Thread(r, name);
        }
        for (Thread t : ts) {
            t.start();
        }
        for (Thread t : ts) {
            t.join();
        }
    }
}
