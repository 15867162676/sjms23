package Observer.Demo1;
import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/16 0016 10:44
 */
public class MyTest {
    @Test
    public void test1(){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        subject.setState(1);
    }
}
