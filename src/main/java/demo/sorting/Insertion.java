package demo.sorting;

/**
 * Created by owen on 2017/7/1.
 */
public class Insertion {
    public static void main(String[] args) {

        Integer[] a = {2,7,4,6,8,9,2};
        sort(a);
        show(a);
    }
    public static void sort(Comparable[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (less(a[j],a[j-1]))
                    exch(a,j,j-1);
            }
        }
    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static boolean isSorted(Comparable[] a){
        for (int i = 0;i<a.length;i++){
            if (less(a[i],a[i+1])) return false;
        }
        return true;
    }
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    /**
     * 插入排序
     * 类型： 基于比较的原地排序
     * 时间复杂度： O(n²)
     * 辅助空间： 不需要
     * 比较次数：最坏 N²/2
     * 交换次数: 最坏 N²/2
     * 输入： 输入元素的初始顺序对排序时间影响较大
     * 稳定性： 稳定
     */
}
