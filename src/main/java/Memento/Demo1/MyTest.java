package Memento.Demo1;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/19 0019 15:43
 */
public class MyTest {
    @Test
    public void test1(){
        GameOriginator originator = new GameOriginator();
        GameCareTaker careTaker = new GameCareTaker();
        //玩游戏
        originator.playGame();
        //保存进度
        careTaker.saveMemento(originator.saveProcess());
        //退出游戏
        originator.exitGame();

        //重新打开游戏，恢复进度
        originator.restoreProcess(careTaker.getMemento(0));
        originator.playGame();

        //保存进度
        careTaker.saveMemento(originator.saveProcess());
        //获取上一次的进度
        originator.restoreProcess(careTaker.getMemento(1));
        originator.playGame();
    }
}
