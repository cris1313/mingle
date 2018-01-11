package demo.sorting;

/**
 * Created by owen on 2017/9/22.
 */
public class TestSorting {
    public static void main(String[] args) {
        //insertsort
        Insertion insertion=new Insertion();
        Selection selection=new Selection();
        Bubbling bubbling=new Bubbling();
        Merge merge=new Merge();


        int[] a={2,6,1,0,4,10,8,44,3,77,4,2,4343,0,29,423,474,1241,245,23,23,45,2};
        //insertion.sort(a);
        //selection.sort(a);
        bubbling.sort(a);
        //merge.sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
