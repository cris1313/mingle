package demo.jvm.intern;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by owen on 2017/9/11.
 */
public class Intern {
    public static void main(String[] args) {
       // String s1 = new String("aaa");
        String s1 = new String("aa") + new String("a");
        s1.intern();
        String s2 = "aaa";
        System.out.println(s1 == s2);
        ConcurrentHashMap map;
        HashMap map1;
    }
}
