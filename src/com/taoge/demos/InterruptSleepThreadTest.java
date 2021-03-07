package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * SleepTest
 *
 * @author chentao
 * @date 2021/3/4
 */
public class InterruptSleepThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            Thread currThread = Thread.currentThread();
            try {
                Debug.debug("开始执行");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Debug.debug("线程中断,状态为{}",currThread.getState());
            }
        }, "t1");
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
        Debug.debug("开始执行");
    }

}
