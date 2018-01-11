package demo.mthread.threadlocaltest;

/**
 * Created by owen on 2017/11/29.
 */
public class MyThread extends Thread {



    public MyThread(){}
    private static volatile int a=0;
    @Override
    public void run() {
        increace();
    }
    private void increace(){
        for (int i = 0; i < 100; i++) {
            a++;
            ThreadLocal l;
        }
    }
    public static void getA(){
        System.out.println(a);
    }
}
