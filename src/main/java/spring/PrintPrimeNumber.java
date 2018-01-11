package spring;

import java.util.LinkedList;

/**
 * Created by owen on 2017/11/3.
 */
public class PrintPrimeNumber {
    public static void main(String[] args) {
        printT();
    }

    public static void print() {
        for (int i = 2; i < 100; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.pow(i, 0.5); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) System.out.println(i);
        }
    }

    public static void printT() {
        LinkedList<Integer> list = new LinkedList();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        for (int i = 2; i < list.size() / 2; i++) {
            for (int j = 1; j <= 100; j++) {
                if (j % i == 0) {
                    list.remove(j-2);
                }
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
