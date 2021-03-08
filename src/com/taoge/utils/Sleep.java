package com.taoge.utils;

import java.util.concurrent.TimeUnit;

/**
 * Sleep 是对Thread.sleep的简单封装
 *
 * @author chentao
 * @date 2021/3/6
 */
public final class Sleep {

    public static void sleep(TimeUnit unit, long duration){
        try {
            unit.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepInterruptibly(TimeUnit unit, long duration) throws InterruptedException{
        unit.sleep(duration);
    }

    public static void millis(long millis){
        sleep(TimeUnit.MILLISECONDS,millis);
    }

    public static void seconds(long seconds){
        sleep(TimeUnit.SECONDS,seconds);
    }
}
