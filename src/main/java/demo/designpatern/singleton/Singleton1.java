package demo.designpatern.singleton;

/**
 * Created by owen on 2017/5/24.
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        //这种方法在多线程环境下会产生问题
        if (instance==null){
             instance = new Singleton1();
        }
        return instance;
    }
}
