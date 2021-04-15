package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * BlockedStateDemo
 *
 * @author chentao
 * @date 2021/4/1
 */
public class BlockedStateDemo {
    private static Object lock = new Object();
    public static void main(String[] args) {
        Runnable runnable = () -> {
            synchronized (lock) {
                Sleep.seconds(5);
            }
        };
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        t1.start();
        t2.start();
        Debug.debug("线程:{},状态：{}",t1.getName(),t1.getState());
        Debug.debug("线程:{},状态：{}",t2.getName(),t2.getState());

    }
}
