package demo.designpatern.singleton;

/**
 * Created by owen on 2017/5/26.
 */
public class Test {
    volatile long a=0;
    public void doSomething(){
        a=1;
        if(a==0){doThing();}
    }
    public void doThing(){

    }
}
