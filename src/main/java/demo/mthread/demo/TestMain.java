package demo.mthread.demo;

/**
 * Created by owen on 2017/9/23.
 */
public class TestMain {
    public static void main(String[] args) {
        B.a();
    }

    static class A {
        static void a() {
            System.out.println("this is A");
        }
    }

    static class B extends A {
        static void a() {
            System.out.println("this is B");
        }
    }
}
