package Memento.Demo2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/19 0019 16:29
 */
public class MyTest {
    @Test
    public void test1(){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("输出当前状态: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("备忘录中第一个状态: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("备忘录中第二个状态: " + originator.getState());
    }
}
