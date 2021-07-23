package TamplateMethod;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/19 0019 19:59
 */
public class MyTest {
    @Test
    public void test1(){
        Game game1 = new Cricket();
        //调用父类中的play方法，实际方法中调用的是子类的具体游戏的方法
        game1.play();
        System.out.println("---------------");
        Game game2 = new Football();
        game2.play();
    }
}
