package demo.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by owen on 2017/5/2.
 */
public class CGLibProxy implements MethodInterceptor {
    private static CGLibProxy instance = new CGLibProxy();
    public static CGLibProxy getInstance(){return instance;}
    private CGLibProxy(){
    }
    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }
    private void before(){
        System.out.println("before");
    }
    private void after(){
        System.out.println("after");
    }
}
