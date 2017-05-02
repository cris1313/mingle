package demo.designpatern.factorymethod;

/**
 * Created by owen on 2017/4/28.
 */
public class Noodle {
    void make(){
        System.out.println("需要10分钟制作面条");
    }
    void boil(){
        System.out.println("需要10分钟煮面");
    }
    void prepare(){
        System.out.println("ok");
    }
}
