package demo.designpatern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by owen on 2017/4/25.
 */
public class SchemeA implements Observer {
    private int data1,data2;
    private Observable o;
    public SchemeA(Observable o){
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Data){
            data1 = ((Data) o).getData1();
            data2 = ((Data) o).getData2();
        }
        display();
    }
    public void display(){
        System.out.println("SchemeA display data1 is "+data1+" data2 is "+data2);
    }
}
