package demo.sorting;

/**
 * Created by owen on 2017/9/17.
 */
public class Merge {
    private static int[] aux;

    public void sort(int[] a) {
        aux = new int[a.length];
        mergeSort(a, 0, a.length - 1);
    }

    //自顶向上
    private void mergeSort(int[] a, int low, int high) {
        if (low >= high) return;
        int length = high - low;
        //插入排序
        if (length <= 7) {
            for (int i = low; i <= high; i++) {
                for (int j = i; j > low; j--) {
                    if (a[j] < a[j - 1]) {
                        int tmp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = tmp;
                    }
                }
            }
            return;
        }
        //递归进行排序
        int mid=(high+low)>>>1;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    private void merge(int[] a,int low,int mid,int high){
        for(int i = low;i <= high;i++)
            aux[i] = a[i];
        int i = low,j = mid + 1;
        for(int k = low;k <= high;k++)
            if(i > mid) a[k] = aux[j++];
            else if(j > high) a[k] = aux[i++];
            else if(aux[j]<aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
    }

}
