package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * TwoPhaseTerminationDemo
 *
 * @author chentao
 * @date 2021/3/14
 */
public class TwoPhaseTerminationDemo {

    private static int percent;
    private static final int MAX = 100;

    public static void main(String[] args) throws InterruptedException {
        DownloadThread downloadThread = new DownloadThread();
        downloadThread.start();
        Thread.sleep(4000);
        downloadThread.stopMe();
    }


    private static class DownloadThread extends Thread{

        public DownloadThread() {
            super("download-thread");
        }

        @Override
        public void run() {
            while (true){
                if (isTerminated()){
                    Debug.debug("取消下载,退出");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    Debug.debug("已下载: {}%",++percent);
                    if(percent >= MAX){
                        Debug.debug("下载完成");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
//                    e.printStackTrace();
                }
            }
        }

        public void stopMe(){
            interrupt();
        }

        public boolean isTerminated(){
            return Thread.currentThread().isInterrupted();
        }
    }
}
