package demo.reflection;

import java.lang.reflect.Method;

/**
 * Created by owen on 2017/5/26.
 */
public class TestA {


    public static void main(String[] args) throws Exception{
        Class<?> cl = Class.forName("demo.reflection.ClassA");
        Object o = cl.newInstance();
        Method method=cl.getMethod("doB",String.class);
        for (int i=0;i<16;i++){
            method.invoke(o,Integer.toString(i));
        }
    }
}
