package demo.designpatern.singleton;

/**
 * Created by owen on 2017/5/24.
 */
public class MutiThreadSingleton {
    private static volatile MutiThreadSingleton instance;
    private MutiThreadSingleton(){}
    public static MutiThreadSingleton getInstance(){
        if(instance==null){
            synchronized (MutiThreadSingleton.class){
                if(instance==null){
                    instance = new MutiThreadSingleton();
                }
            }
        }
        return instance;

    }


}
