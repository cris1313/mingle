package demo.random;

/**
 * Created by owen on 2017/12/8.
 */
public class Son extends Parent {
    {
        System.out.println("子块");
    }

    static {
        System.out.println("子静态块");
    }

    public Son() {
        System.out.println("子构造函数");
    }

    public static void main(String[] args) {
        new Son();
    }
}