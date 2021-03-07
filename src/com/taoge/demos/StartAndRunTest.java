package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * StartAndRunTest
 *
 * @author chentao
 * @date 2021/3/3
 */
public class StartAndRunTest {
    public static void main(String[] args) {
        Debug.debug("我是线程:{}",Thread.currentThread().getName());
        Thread t2 = new Thread(() -> Debug.debug("我是线程:{}",Thread.currentThread().getName()),"t2");
        t2.run();
    }
}
