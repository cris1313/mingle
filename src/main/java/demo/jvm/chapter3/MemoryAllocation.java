package demo.jvm.chapter3;

/**
 * Created by owen on 2017/9/15.
 */
public class MemoryAllocation {
    private final static int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] allo1,allo2,allo3,allo4,allo5;
     //   allo1=new byte[_1MB*4];
        allo2=new byte[_1MB*2];
        allo4=new byte[_1MB*3];
        allo3=new byte[_1MB/4];
        allo4=new byte[_1MB/4+100];
        allo4=new byte[_1MB/4+100];
        allo4=new byte[_1MB/4+100];
        allo5=new byte[_1MB*7];
        allo5=new byte[_1MB+100];
        allo1=new byte[_1MB*4];
        allo1=new byte[_1MB*4];








    }
}
