package Observer.Demo1;


/**
 * @author TF014268
 * @description 观察者2
 * @since 2021/7/16 0016 10:39
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver观察者收到修改通知了");
    }
}
