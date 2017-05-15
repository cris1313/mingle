package demo.proxy.springaop;

/**
 * Created by owen on 2017/5/3.
 */
public class Greetingimpl implements Greet{

    public void greet(String name) {
        System.out.println("greet " + name);
    }
}
