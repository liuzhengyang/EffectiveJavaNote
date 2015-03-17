package com.chapter1;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 考虑用静态工厂方法代替构造器
 * 优点
 * 1.静态工厂方法具有名称
 * 2.不必在每次调用它们的时候都创建一个新对象
 * 3.它们可以返回原返回类型的任何子类型的对象 Service Provider Framework
 * 4.在创建参数化类型实例的时候，它们是代码变得更加简洁
 * Created by liuzhengyang on 2015/3/17.
 */
public class Item1 {

    @Test
    public void useStaticFactory(){
        Map<String, List<String>> m = new HashMap<String, List<String>>();
        Map<String, List<String>> m2 = newInstance();
        Map<String, List<String>> m3 = Collections.emptyMap();
    }

    public static Map<String, List<String>> newInstance(){
        return new HashMap<String, List<String>>();
    }

    static Boolean booleanValueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
