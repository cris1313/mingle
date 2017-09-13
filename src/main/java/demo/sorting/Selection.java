package demo.sorting;

/**
 * Created by owen on 2017/7/1.
 */
public class Selection {

    public static void main(String[] args) {
        Integer[] a = {2,7,4,6,8,9,2};
        sort(a);
        show(a);
    }

    public static void sort(Comparable[] a){

        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i;j<a.length;j++){
                if (less(a[j],a[min]))
                    min=j;
            }
            exch(a,i,min);
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
    public static void show(Comparable[] a){
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    /**
     * 选择排序
     * 类型： 基于比较的原地排序
     * 时间复杂度： O(n²)
     * 辅助空间： O(1)
     * 比较次数：N²/2
     * 交换次数: N
     * 输入： 运行时间与输入无关
     * 移动： 数据移动次数是最少的
     * 稳定性： 不稳定
     */
}
