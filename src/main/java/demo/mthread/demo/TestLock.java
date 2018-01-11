package demo.mthread.demo;

/**
 * Created by owen on 2017/9/18.
 */
public class TestLock {
    //private static AtomicInteger a=new AtomicInteger(0);
    private static int a=0;

    public static void count(){
        a++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    TestLock.count();
                }
            }).start();
            System.out.println(TestLock.a);

        }

    }
}
