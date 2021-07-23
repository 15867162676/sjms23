package ChainOfResponsipility.Demo1;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/14 0014 15:29
 */
public class MyTest {
    @Test
    public void test1(){
        //初始化小组领导类，其中会初始化责任链中的一系列类
        GroupLeader leader = new GroupLeader();
        System.out.println("----------------------");

        System.out.println(String.format("领导您好：由于开发需求，需要购买一台Mac笔记本电脑，预算为%d 望领导批准", 95000));
        if (leader.handle(95000)) {
            System.out.println("谢谢领导");
        } else {
            System.out.println("巧妇难为无米之炊，只能划船了...");
        }
    }
}
