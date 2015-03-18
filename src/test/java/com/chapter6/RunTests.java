package com.chapter6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liuzhengyang on 2015/3/18.
 */
public class RunTests {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int tests = 0;
        int passed = 0;
        String className = "com.chapter6.Item35";
        Class testClass = Class.forName(className);
        Object obj = testClass.newInstance();
        for(Method m : testClass.getMethods()){
            if(m.isAnnotationPresent(Test.class)){
                tests++;
                try {
                    m.invoke(obj);
                    passed++;
                    System.out.println("passed "  + m);
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    System.out.println(m + " failed " + exc);
                }catch (Exception e){
                    System.out.println("Invalid @test " + m);
                }
            }
        }
        System.out.printf("Passed : %d, Failed: %d%n", passed, tests - passed);
    }
}
