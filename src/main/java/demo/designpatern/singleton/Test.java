package demo.designpatern.singleton;

/**
 * Created by owen on 2017/5/26.
 */
public class Test {
    public static void main(String[] args) {
        StaticSingleton instance1=StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();
        System.out.println(instance1);
    }
}
