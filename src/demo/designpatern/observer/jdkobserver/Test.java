package demo.designpatern.observer.jdkobserver;

/**
 * Created by owen on 2017/4/26.
 */
public class Test {
    public static void main(String[] args) {
        Data data = new Data();
        SchemeA a = new SchemeA(data);
        SchemeB b = new SchemeB(data);
        data.setData(1,2);
        data.setData(3,6);
    }
}
