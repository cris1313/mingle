package demo.tij.holdingyourobject;

import demo.util.proxy.JDKProxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by owen on 2017/6/2.
 */
public class AddingGroup implements AddGroup{
    public static void main(String[] args) {
        AddGroup a = new AddingGroup();
        JDKProxy jdkProxy = new JDKProxy(a);
        AddGroup aPro = jdkProxy.getProxy();
        long count=10000000;
        aPro.addGroup1(count);
        aPro.addGroup2(count);
/*

       AddingGroup a= new AddingGroup();
        long count=10000000;
       a.addGroup1(count);
        a.addGroup2(count);
*/

    }

    @Override
    public void addGroup1(long count) {
        long start = System.currentTimeMillis();

        for (int i=0;i<count;i++) {
            Collection<Integer> collection = new ArrayList<Integer>();
            collection.addAll(Arrays.asList(1,2,4,6,7));
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("slow");
    }

    public void addGroup2(long count){
        long start = System.currentTimeMillis();
        for (int i=0;i<count;i++) {
            Collection<Integer> collection = new ArrayList<Integer>();
            Collections.addAll(collection,1,2,4,6,7);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("faster");
    }
}
