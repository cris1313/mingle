package demo.proxy.jdkdynamic;

import demo.proxy.Hello;
import demo.proxy.Helloplm;

/**
 * Created by owen on 2017/5/2.
 */
public class TestJDKProxy {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Hello hello = new Helloplm();
        DynamicProxy proxy = new DynamicProxy(hello);
        Hello helloProxy = proxy.getProxy();
        helloProxy.say(" JDK Dynamic");
    }
}
