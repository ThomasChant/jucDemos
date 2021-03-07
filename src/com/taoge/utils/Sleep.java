package com.taoge.utils;

import java.util.concurrent.TimeUnit;

/**
 * Sleep
 *
 * @author chentao
 * @date 2021/3/6
 */
public class Sleep {

    public static void sleep(TimeUnit unit, long duration){
        try {
            unit.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void millis(long millis){
        sleep(TimeUnit.MILLISECONDS,millis);
    }

    public static void seconds(long seconds){
        sleep(TimeUnit.SECONDS,seconds);
    }
}
