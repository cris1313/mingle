package demo.designpatern.singleton;

/**
 * Created by owen on 2017/5/24.
 */
public class MutiThreadSingleton {
    private static  MutiThreadSingleton instance;
    private MutiThreadSingleton(){}
    public static MutiThreadSingleton getInstance(){
        if(instance==null){
            synchronized (MutiThreadSingleton.class){
                // TODO: 2017/5/24  
            }
        }
        return instance;
    }

}
