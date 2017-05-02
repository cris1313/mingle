package demo.designpatern.observer.badsolution;

/**
 * Created by owen on 2017/4/26.
 */
public class Data {

    private SchemeA schemeA;
    private SchemeB schemeB;
    public void setData(int data1,int data2){
        schemeA = new SchemeA();
        schemeB = new SchemeB();
        schemeA.setData(data1,data2);
        schemeB.setData(data1,data2);
    }
}
