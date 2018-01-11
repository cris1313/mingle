package demo.sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if (judge(i))
                res++;
        }
        System.out.println(res );
    }

    private static boolean judge(int num) {
        int bit;
        int reverse = 0;
        int tmp = num;

        for (bit = 0; tmp != 0; ++bit) tmp >>= 1;

        for (tmp = num; bit > 0; --bit) {
            reverse <<= 1;
            reverse |= (tmp & 1);
            tmp >>= 1;
        }

        return reverse == num;

    }

}
