package Observer.Demo2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/16 0016 11:13
 */
public class MyTest {
    @Test
    public void test1(){
        Subject subject = new Subject();
        subject.addAttach(new ObserverA());
        subject.addAttach(new ObserverB());
        subject.setMsg("**");
    }
}
