package com.chapter6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liuzhengyang on 2015/3/18.
 */
public class RunExceptionTests {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "com.chapter6.Sample2";
        int tests = 0;
        int passed = 0;
        Class targetClass = Class.forName(className);
        Object obj = targetClass.newInstance();
        for(Method m : targetClass.getMethods()){
            if(m.isAnnotationPresent(ExceptionTest.class)){
                tests++;
                try {
                    m.invoke(obj);
                    System.out.printf("Test %s failed : no exception %n", m);
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    Class<? extends Exception> excType = m.getAnnotation(ExceptionTest.class).value();
                    if(excType.isInstance(exc)){
                        passed++;
                    }else{
                        System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), exc);
                    }
                }catch (Exception e){
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed : %d, Failed: %d%n", passed, tests - passed);
        System.out.println(tests);
    }
}
