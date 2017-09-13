package demo.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by owen on 2017/9/11.
 */
public class HeapOOM {
    static class OOMObject{}
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new OOMObject());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
