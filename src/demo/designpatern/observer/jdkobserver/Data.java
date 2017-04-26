package demo.designpatern.observer.jdkobserver;

import java.util.Observable;

/**
 * Created by owen on 2017/4/25.
 */
public class Data extends Observable {
    private int data1,data2;
    public Data(){
    }
    public void setData(int data1,int data2){
        this.data1 = data1;
        this.data2= data2;
        mesureChange();
    }
    public void mesureChange(){
        setChanged();
        notifyObservers();
    }
    public int getData1() {
        return data1;
    }
    public int getData2() {
        return data2;
    }

}
