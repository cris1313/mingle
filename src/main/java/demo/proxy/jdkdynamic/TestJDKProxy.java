package demo.proxy.jdkdynamic;

import demo.proxy.Hello;
import demo.proxy.Helloplm;

import java.util.*;

/**
 * Created by owen on 2017/5/2.
 */
public class TestJDKProxy {


    public static void main(String[] args) {
        Hello hello = new Helloplm();
        DynamicProxy proxy = new DynamicProxy(hello);
        Hello helloProxy = proxy.getProxy();
        helloProxy.say(" JDK Dynamic");
        ArrayList k = new ArrayList();

        LinkedList kk;
        String kad = new String("sasa");
        StringBuilder dsgsdg;
        StringBuffer adas;



    }
    int hhh(){
        int[] a = {3,4};
        int i=0;
        System.out.println(a[i=1]);
        return i;
    }

}

