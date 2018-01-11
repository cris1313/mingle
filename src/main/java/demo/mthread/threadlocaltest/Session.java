package demo.mthread.threadlocaltest;

/**
 * Created by owen on 2017/11/29.
 */
public class Session {
    private int state;
    private String name;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
