package demo.designpatern.observer.observers;

/**
 * Created by owen on 2017/4/25.
 */
public interface Subject {
     void addObserver(Observer o);
     void removeObserver(Observer o);
     void notifyAllObservers();
}
