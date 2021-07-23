package Observer.Demo2;

/**
 * @author TF014268
 * @description 观察者a
 * @since 2021/7/16 0016 11:06
 */
public class ObserverA extends Observer{
    @Override
    public void update(String msg) {
        System.out.println("ObserverA修改" + msg);
    }
}
