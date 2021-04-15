package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * JstackTest
 *
 * @author chentao
 * @date 2021/4/3
 */
public class JstackTest {
    private static Object lock = new Object();
    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (lock) {
                Sleep.seconds(100);
            }
        };
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        t1.start();
        t2.start();
    }
}
