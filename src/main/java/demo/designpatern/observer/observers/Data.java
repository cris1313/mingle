package demo.designpatern.observer.observers;

import java.util.ArrayList;

/**
 * Created by owen on 2017/4/25.
 */
public class Data implements Subject {
    ArrayList observers;
    private int data1, data2;
    public Data(){
        this.observers = new ArrayList();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>0) observers.remove(i);
    }
    @Override
    public void notifyAllObservers() {
        for (Object obj:observers){
            Observer observer = (Observer)obj;
            observer.update(data1,data2);
        }
    }
    public void setData(int data1,int data2){
        this.data1 = data1;
        this.data2 = data2;
        measureChange();
    }
    public void measureChange(){
        notifyAllObservers();
    }
}
