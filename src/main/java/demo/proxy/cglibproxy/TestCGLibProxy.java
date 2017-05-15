package demo.proxy.cglibproxy;

/**
 * Created by owen on 2017/5/2.
 */
public class TestCGLibProxy {
    public static void main(String[] args) {
        HelloCGlib hello = CGLibProxy.getInstance().getProxy(HelloCGlib.class);
        hello.say(" CHLib proxy");
    }
}
