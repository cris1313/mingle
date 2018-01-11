package demo.jvm.chapter7;

/**
 * Created by owen on 2017/9/16.
 */
public class Load {
    static {
        i=0;
    }
    interface i1{
        int i=0;
    }
    static class parent{
        static int  i=19;
    }
    static class SSS extends parent implements i1{
         static int i=9;
    }
    static int i=1;
    public static void main(String[] args) throws InterruptedException {

        System.out.println(i1.i);
    }
}
