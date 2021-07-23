package Observer.Demo1;


/**
 * @author TF014268
 * @description 观察者1
 * @since 2021/7/16 0016 10:37
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BinaryObserver观察者收到修改通知了");
    }
}
