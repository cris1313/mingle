package demo.commons;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by owen on 2017/9/12.
 */
public class MyMapTest {

    public static void main(String[] args) {
        /* HashMap<Integer, String> map = new HashMap<Integer, String>(2);
         for (int i=0;i<8;i++){
             map.put(i,"1");
         }

         new HashMap(3,0.75f);*/
        new ConcurrentHashMap<>(3,0.75f);

    }

}
