package demo.proxy;

import demo.proxy.Hello;

/**
 * Created by owen on 2017/5/2.
 */
public class Helloplm implements Hello {

    @Override
    public void say(String name) {
        System.out.println("hello"+name
        );
    }
}
