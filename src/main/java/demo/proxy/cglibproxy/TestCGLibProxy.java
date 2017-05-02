package demo.proxy.cglibproxy;

import demo.proxy.Hello;
import demo.proxy.Helloplm;

/**
 * Created by owen on 2017/5/2.
 */
public class TestCGLibProxy {
    public static void main(String[] args) {
        Hello hello = CGLibProxy.getInstance().getProxy(Helloplm.class);
        hello.say(" CHLib proxy");
    }
}
