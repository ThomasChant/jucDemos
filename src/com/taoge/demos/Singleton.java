package com.taoge.demos;

import com.taoge.utils.Debug;

/**
 * SingletonDemo
 *
 * @author chentao
 * @date 2021/4/10
 */
public class Singleton {

    private Integer a;

    public Singleton(Integer a) {
        this.a = a;
    }

    private static Singleton singleton;

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton(1);
                }
            }
        }
        return singleton;
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(()->{
                while (true) {
                    Singleton instance = Singleton.getInstance();
                    if(instance != null){
                        if(instance.a==null) {
                            Debug.debug("not init complete");
                            break;
                        }else {
                            synchronized (Singleton.class) {
                                singleton = null;
                            }
                        }
                    }
                }
            },"t"+i);
            thread.start();
        }
    }
}
