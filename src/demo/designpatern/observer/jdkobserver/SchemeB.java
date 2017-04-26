package demo.designpatern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by owen on 2017/4/26.
 */
public class SchemeB implements Observer{
    private int data1,data2;
    public SchemeB(Observable o){
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Data){
            this.data1 = ((Data) o).getData1();
            this.data2 = ((Data) o).getData2();
        }
        display();
    }
    public void display(){
        System.out.println("SchemeA display data1 is "+data1+" data2 is "+data2);
    }
}
