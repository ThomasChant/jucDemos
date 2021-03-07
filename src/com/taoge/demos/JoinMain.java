package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * JoinTest
 *
 * @author chentao
 * @date 2021/3/6
 */
public class JoinMain {

    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread t = new Thread(myTask);
        t.start();
        //t.join();
        Debug.debug("{}",myTask.result);
    }

    private static class MyTask implements Runnable{
        private int result;

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result = 100;
        }
    }
}
