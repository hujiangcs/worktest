package com.Mult;

import org.testng.annotations.Test;
/*
多线程 xml实现

*/

public class MultiThreadONXml {
    @Test
    public  void  test1(){

        System.out.printf("Tread Id :%s%n", Thread.currentThread());
    }
    @Test
    public  void  test2(){

        System.out.printf("Tread Id :%s%n", Thread.currentThread());
    }
}
