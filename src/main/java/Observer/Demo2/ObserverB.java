package Observer.Demo2;

/**
 * @author TF014268
 * @description 观察者b
 * @since 2021/7/16 0016 11:07
 */
public class ObserverB extends Observer{
    @Override
    public void update(String msg) {
        System.out.println("ObserverB修改" + msg);
    }
}
