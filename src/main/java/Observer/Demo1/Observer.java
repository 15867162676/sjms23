package Observer.Demo1;

/**
 * @author TF014268
 * @description 观察者抽象类
 * @since 2021/7/16 0016 10:36
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
