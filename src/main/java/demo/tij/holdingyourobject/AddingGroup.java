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
//        aPro.addGroup1();
        aPro.addGroup2();

    }

    @Override
    public void addGroup1() {
        Integer[]moreInts=new Integer[100000];
        for (int i=0;i<100000;i++) {
            moreInts[i]=i;
        }
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,4,6,7));
        collection.addAll(Arrays.asList(moreInts));
        System.out.println("slow");

    }

    public void addGroup2(){
        Integer[]moreInts=new Integer[100000];
        for (int i=0;i<100000;i++) {
            moreInts[i]=i;
        }
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,4,6,7));
        Collections.addAll(collection,moreInts);

        System.out.println("faster");
    }
}
