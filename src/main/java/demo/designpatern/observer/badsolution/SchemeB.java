package demo.designpatern.observer.badsolution;

/**
 * Created by owen on 2017/4/26.
 */
public class SchemeB {
    private int data1,data2;
    public void setData(int data1,int data2){
        this.data1 = data1;
        this.data2 =data2;
        display();
    }
    public void display(){
        System.out.println("SchemeB display: "+"data1 is "+data1+" data2 is "+data2);
    }
}
