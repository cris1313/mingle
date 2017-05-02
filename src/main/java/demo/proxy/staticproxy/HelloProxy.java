package demo.proxy.staticproxy;

import demo.proxy.Hello;
import demo.proxy.Helloplm;

/**
 * Created by owen on 2017/5/2.
 */
public class HelloProxy implements Hello {
    private Hello hello;
    HelloProxy(){
        hello = new Helloplm();
    }
    private void after(){
        System.out.println("after");
    }
    private void before(){
        System.out.println("before");
    }


    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }
}
