package com.chapter6;

import org.junit.Test;

/**
 * 注解优先于命名模式
 * Created by liuzhengyang on 2015/3/18.
 */
public class Item35 {


    @Test
    public void useAnnotation(){

    }


    @com.chapter6.Test
    public static void m1(){} // Test should pass
    public static void m2(){}
    @com.chapter6.Test public static void m3(){
        throw new RuntimeException("Boom");
    }
    @com.chapter6.Test public void m4(){}
}
