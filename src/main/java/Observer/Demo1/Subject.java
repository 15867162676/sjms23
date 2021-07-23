package Observer.Demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description Subject绑定观察者
 * @since 2021/7/16 0016 10:35
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //调用通知观察者的方法
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知观察者修改
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
