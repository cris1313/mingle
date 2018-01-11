package demo.mthread.demo;

/**
 * Created by owen on 2017/9/19.
 */
public class AlarmAgent {
    private final static AlarmAgent INSTANCE = new AlarmAgent();
    private final HeartThread heartThread = new HeartThread();
    public static AlarmAgent getInstance(){return INSTANCE;}
    private boolean connectToServer=false;
    private AlarmAgent(){}
    class HeartThread{}

}
