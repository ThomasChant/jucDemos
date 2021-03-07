package com.taoge.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Debug
 *
 * @author chentao
 * @date 2021/3/4
 */
public class Debug {
    private static SimpleDateFormat format = new SimpleDateFormat();

    static {
        format.applyPattern("yyyy-MM-dd HH:mm:ss");
    }

    public static void debug(String msg, Object... params){
        for (Object param : params) {
            msg = msg.replaceFirst("\\{\\}",param.toString());
        }
        System.out.println(format.format(new Date())+" ["+Thread.currentThread().getName()+"] "+msg);
    }


}
