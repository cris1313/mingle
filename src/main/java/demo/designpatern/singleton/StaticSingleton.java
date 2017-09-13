package demo.designpatern.singleton;

/**
 * Created by owen on 2017/6/9.
 */
public class StaticSingleton {
    private StaticSingleton(){}
    public static StaticSingleton getInstance(){
        return Inner.instance;
    }
    private static class Inner{
        final static StaticSingleton instance=new StaticSingleton();
    }
}
