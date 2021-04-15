package com.taoge.demos;

/**
 * VolatileTest
 *
 * @author chentao
 * @date 2021/4/11
 */
public class VolatileTest {
    volatile int tao1;
    private int b;
    public void write(){
        b = 1;
        tao1 = 1;
    }

//    public void read(){
//        if(flag){
//            b = 2;
//        }
//    }

    public static void main(String[] args) {

    }
}
