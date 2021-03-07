package com.taoge.demos;

import com.taoge.utils.Debug;
import com.taoge.utils.Sleep;

/**
 * DaemonThreadMain
 *
 * @author chentao
 * @date 2021/3/6
 */
public class DaemonThreadMain {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            Debug.debug("开始执行");
            Sleep.seconds(3);//睡眠3s
            Debug.debug("执行结束");
        },"t1");
        t.setDaemon(true);
        t.start();
        Sleep.seconds(1);
        Debug.debug("执行结束");
    }
}
