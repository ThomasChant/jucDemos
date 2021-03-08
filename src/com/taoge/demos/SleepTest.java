package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

import java.util.logging.Logger;

/**
 * SleepTest
 *
 * @author chentao
 * @date 2021/3/4
 */
public class SleepTest {

    public static void main(String[] args) {
        new Thread(() -> {
            Debug.debug("开始执行");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Debug.debug("执行结束");
        },"t1").start();
    }
}
