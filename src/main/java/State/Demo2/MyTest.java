package State.Demo2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/20 0020 14:10
 */
public class MyTest {
    @Test
    public void test1(){
        Context context = new Context();

        //定义初始状态为关门（共四种初始值）
        context.setLiftState(new ClosingState());
        context.open();//先打开电梯门
        context.close();//再关闭电梯门
        context.run();//电梯运行
        context.stop();//电梯停止
    }

    @Test
    public void test2(){
        Context context = new Context();

        //定义初始状态为运行状态
        context.setLiftState(new RunningState());
        context.stop();//先停止电梯
        context.open();//再打开电梯门
        context.close();//关闭电梯门
        context.run();//运行电梯

    }
}
