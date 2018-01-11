package demo.random;

/**
 * Created by owen on 2017/12/8.
 */
public class SuiShouJiTest {
    public static void main(String[] args) {

        System.out.println(convert("hello Helo WoS"));
    }

    public static int climb(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climb(n - 1) + climb(n - 2);
    }

    public static String convert(String s) {
        if (s == null) return null;
        char[] arrays = s.toCharArray();
        int length = arrays.length;
        for (int i = 0; i < length; i++) {
            if (arrays[i] > 'A' && arrays[i] < 'Z') {
                arrays[i] = (char) (arrays[i] + 32);
            } else if (arrays[i] > 'a' && arrays[i] < 'z') {
                arrays[i] = (char) (arrays[i] - 32);
            }
        }
        return String.valueOf(arrays);
    }
}
