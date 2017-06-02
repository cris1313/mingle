package demo.util.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by owen on 2017/6/2.
 */
public class TimeProxy implements MethodInterceptor {
    private static class InstanceHolder{
        final static TimeProxy INSTANCE = new TimeProxy();
    }
    private TimeProxy(){}
    public static TimeProxy getInstance(){return InstanceHolder.INSTANCE; }
    public long before(){
        return System.currentTimeMillis();
    }
    public long after(){
        return System.currentTimeMillis();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long before=0,after=0;
        before=before();
        System.out.println(before);
        Object result = methodProxy.invokeSuper(o,objects);
        after=after();
        System.out.println(after);
        System.out.println(after-before);
        return result;
    }
    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }
}
