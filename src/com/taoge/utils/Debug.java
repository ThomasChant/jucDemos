package com.taoge.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Debug类是对System.out.println的简单封装，便于打印出类似这样格式化的日志:
 * 2021-03-07 20:11:06 [t1] 这是测试
 * 包含了日期时间、线程名称和自定义的打印内容
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
