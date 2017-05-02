package demo.proxy.springaop;

import demo.proxy.Hello;
import demo.proxy.Helloplm;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by owen on 2017/5/2.
 */
public class TestSpringAOP {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new Helloplm());
        proxyFactory.addAdvice(new HelloBeforeAdvice());
        proxyFactory.addAdvice(new HelloAfterAdvice());
        Hello hello = (Hello)proxyFactory.getProxy();
        hello.say(" springAOP");
    }
}
