package Observer.Demo1;

/**
 * @author TF014268
 * @description 观察者3
 * @since 2021/7/16 0016 10:42
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver观察者收到修改通知了");
    }
}
