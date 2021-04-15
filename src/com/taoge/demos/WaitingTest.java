package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;
import org.junit.Test;

import java.util.concurrent.locks.LockSupport;

/**
 * ParkTest
 *
 * @author ct
 * @date 2021/4/2
 */
public class WaitingTest {

    @Test
    public void testJoin() throws InterruptedException {
        //线程t1阻塞100s
        Thread t1 = new Thread(()->{
            Sleep.seconds(100);
        });
        //线程t1启动
        t1.start();
        //main线程等待线程t1线程执行完毕
        t1.join();
    }

    @Test
    public void testWait(){

    }

    @Test
    public void testParkUntil(){
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().interrupt();
    }


    @Test
    public void testParkNanos(){
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LockSupport.park();
        Thread.currentThread().interrupt();
    }
}
