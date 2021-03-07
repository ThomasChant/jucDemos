package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * PriorityDemo
 *
 * @author chentao
 * @date 2021/3/7
 */
public class PriorityDemo {

    private static class PriorityThread extends Thread{
        private volatile int count;

        public PriorityThread(String name, int priority) {
            super(name);
            this.count = 0;
            this.setPriority(priority);
        }

        @Override
        public void run() {
            synchronized (PriorityThread.class){
                Debug.debug("拿到锁");
                while (true){
                    count++;
                    if(count>10000000){
                        Debug.debug("执行完毕");
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PriorityThread[] threads = new PriorityThread[10];
        for (int i = 0; i < 10; i++) {
            if(i < 5){
                threads[i] = new PriorityThread("highThread"+i,Thread.MAX_PRIORITY);
            }else {
                threads[i] = new PriorityThread("lowThread",Thread.MIN_PRIORITY);
            }
        }
        for (int i = 0; i < 10; i++) {
            if(i < 5){
                threads[i].start();
            }else {
                threads[i].start();
            }
        }
    }
}
