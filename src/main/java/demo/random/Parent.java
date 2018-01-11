package demo.random;

/**
 * Created by owen on 2017/12/8.
 */
public class Parent {
    static {
        System.out.println("父静态块");
    }

    public Parent() {
        System.out.println("父构造函数");
    }


    }
