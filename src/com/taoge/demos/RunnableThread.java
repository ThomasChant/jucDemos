package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * CreateThread
 *
 * @author chentao
 * @date 2021/2/26
 */
public class RunnableThread {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Debug.debug("我是线程t2");
            }
        };
        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
