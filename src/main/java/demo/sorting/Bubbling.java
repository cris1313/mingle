package demo.sorting;

/**
 * Created by owen on 2017/9/28.
 */
public class Bubbling {
    public void sort(int[] a) {
        if (a == null) return;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
}
