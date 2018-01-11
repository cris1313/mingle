package demo.mthread.threadlocaltest;

/**
 * Created by owen on 2017/11/29.
 */
public class Connection {
    ThreadLocal<Session> sessions = new ThreadLocal<>();

    public Session getSession() {
        if (sessions.get() == null)
            sessions.set(new Session());
        return sessions.get();
    }

    private volatile Session session;

    public synchronized Session getSynchronizedSession() {
        if (session == null) {
            return new Session();
        } else return session;
    }
}
