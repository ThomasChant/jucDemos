package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * CreateThread
 *
 * @author chentao
 * @date 2021/2/26
 */
public class ExtendThread {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
    }

    public static class MyThread extends Thread{
        @Override
        public void run() {
            Debug.debug("我是线程t1",1);
        }
    }
}
