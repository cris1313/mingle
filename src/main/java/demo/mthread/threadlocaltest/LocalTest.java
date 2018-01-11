package demo.mthread.threadlocaltest;

/**
 * Created by owen on 2017/11/29.
 */
public class LocalTest {
    private int a=0;
    public void print(){
        a++;
        System.out.println(Thread.currentThread()+""+a);
    }
}
