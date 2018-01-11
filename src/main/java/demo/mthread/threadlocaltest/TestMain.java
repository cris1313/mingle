package demo.mthread.threadlocaltest;

/**
 * Created by owen on 2017/11/29.
 */
public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Connection conn = new Connection();

        long before = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Session session = conn.getSynchronizedSession();
                }
            }).start();
        }
        Thread.sleep(10000);
        long total = System.currentTimeMillis() - before;

        System.out.println("total is " + total);

    }

}
