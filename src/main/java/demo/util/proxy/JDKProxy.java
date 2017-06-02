package demo.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by owen on 2017/6/2.
 */
public class JDKProxy implements InvocationHandler {

    public long before(){
        return System.currentTimeMillis();
    }
    public long after(){
        return System.currentTimeMillis();
    }

    private Object target;
    public  JDKProxy(Object target){
        this.target = target;
    }


    @SuppressWarnings("unchecked")
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long before=0,after=0;
        before=before();
        System.out.println(before);
        Object result = method.invoke(target,args);
        after=after();
        System.out.println(after);
        System.out.println(after-before);
        return result;
    }
}
