package demo.proxy.staticproxy;

/**
 * Created by owen on 2017/5/2.
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        HelloProxy proxy = new HelloProxy();
        proxy.say(" static proxy");
    }
}
