package com.chapter1;

import org.junit.Test;

/**
 * 所有的构造器都必须显示或隐式地调用父类构造器(super class constructor)
 * Created by liuzhengyang on 2015/3/17.
 */
public class Item3 {

    private static class Elvis{
        public static final Elvis INSTANCE = new Elvis();

        private Elvis(){

        }

    }

    private static enum Elvis2{
        INSTANCE;
        Elvis2(){
            System.out.println("enum constructor");
        }
        public void leaveTheBuilding(){

        }
    }


    @Test
    public void testSingleton(){
        System.out.println(Elvis2.INSTANCE);
    }
}
