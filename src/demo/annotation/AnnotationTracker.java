package demo.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by owen on 2017/4/23.
 */
public class AnnotationTracker {
    public static void track(List<Integer> list,Class<?> cl){
        for(Method method:cl.getDeclaredMethods()){
            CC cc = method.getAnnotation(CC.class);
            System.out.println(cc);
            if(cc!=null){ System.out.println("found"+cc.id()+" "+ cc.value());
            list.remove(new Integer(cc.id()));}
        }
        for(int i:list) System.out.println("miss"+i);
    }
    public static void main(String[] args) {
        List<Integer> ca = new ArrayList<>();
        Collections.addAll(ca,1,2,3,4);
        track(ca,ControllerCase.class);
    }

}
