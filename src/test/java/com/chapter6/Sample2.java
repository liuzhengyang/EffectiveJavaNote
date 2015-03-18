package com.chapter6;

/**
 * Created by liuzhengyang on 2015/3/18.
 */
public class Sample2 {


    @ExceptionTest(ArithmeticException.class)
    public void m1(){
        int i = 0;
        i = 1/i;
    }

    @ExceptionTest(ArithmeticException.class)
    public void m2(){ // Wrong exception
        int[] a = new int[0];
        a[1] = 1;
    }

    @ExceptionTest(ArithmeticException.class)
    public void m3(){
        // should fail , no exception
    }
}
