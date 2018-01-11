package demo.mthread.demo;

import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by owen on 2017/9/20.
 */
public class ThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        for (int j=0;j<10;j++) {
            new ConcurrentHashMap<>();
            Executor u= Executors.newFixedThreadPool(10);
            Vector list = new Vector();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }

            ThreadSafety a = new ThreadSafety();

            new Thread(new Runnable() {
                @Override
                public void run() {

                    a.delete(list);

                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        a.get(list);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }

    public synchronized void get(Vector list) throws InterruptedException {
        int index=list.size();
        Thread.sleep(1000);
        list.get(index-1);
    }

    public synchronized void delete(Vector list) {
        list.remove(list.size() - 1);
    }
}
