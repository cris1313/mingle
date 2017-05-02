package demo.annotation;

/**
 * Created by owen on 2017/4/23.
 */
public class ControllerCase {

    @CC(id = 1)
    public void hello(){
        System.out.println("hello");
    }
    @CC(id = 2)
    public void helloAgain(){
        System.out.println("again");
    }


}
