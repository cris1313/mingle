package demo.designpatern.observer.observers;


/**
 * Created by owen on 2017/4/25.
 */
public class SchemeB implements Observer, Display {
    private int data1,data2;
    private Subject data;
    public SchemeB(Subject data){
        this.data = data;
        data.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("SchemeB display: "+"data1 is "+data1+" data2 is "+data2);
    }

    @Override
    public void update(int data1,int data2) {
        this.data1 = data1;
        this.data2 = data2;
        display();
    }
}
