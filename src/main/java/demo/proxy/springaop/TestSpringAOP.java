package demo.proxy.springaop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by owen on 2017/5/2.
 */
public class TestSpringAOP {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
      //  proxyFactory.addInterface(Greet.class);
        proxyFactory.setTarget(new Greetingimpl());
        proxyFactory.addAdvice(new HelloBeforeAdvice());
        proxyFactory.addAdvice(new HelloAfterAdvice());
       // proxyFactory.setTargetClass(Greet.class);
        Greetingimpl greetingimpl = (Greetingimpl) proxyFactory.getProxy();
        greetingimpl.greet("c");
       // Greet greet = (Greet)greetingimpl;
       // greet.greet("c");
    }
}
