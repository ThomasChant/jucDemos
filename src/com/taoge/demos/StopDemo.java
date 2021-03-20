package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * StopTest
 *
 * @author chentao
 * @date 2021/3/10
 */
public class StopDemo {

    public static void main(String[] args) {
        new ReadThread().start();
        ChangeThread changeThread = new ChangeThread();
        changeThread.start();
        Sleep.seconds(2);
        changeThread.stop();
    }

    private static int num;

    private static class ChangeThread extends Thread {
        public ChangeThread() {
            super("change-thread");
        }

        @Override
        public void run() {
            while (true) {
                synchronized (StopDemo.class) {
                    num++;
                    Sleep.seconds(1);
                    num--;
                }
            }
        }
    }

    private static class ReadThread extends Thread{
        public ReadThread() {
            super("read-thread");
        }

        @Override
        public void run() {
            while (true){
                synchronized (StopDemo.class){
                    if(num!=0){
                        Debug.debug("原子性被破坏");
                        break;
                    }
                }
            }
        }
    }
}
