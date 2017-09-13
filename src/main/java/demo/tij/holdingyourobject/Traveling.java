package demo.tij.holdingyourobject;

import java.util.*;

/**
 * Created by owen on 2017/6/3.
 */
public class Traveling {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("1",1);
        map.put("2",2);
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String s:map.keySet()){
            System.out.println(map.get(s));
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.set(4);
        }
    }
}
