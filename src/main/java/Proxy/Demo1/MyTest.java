package Proxy.Demo1;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/20 0020 19:25
 */
public class MyTest {
    @Test
    public void test1(){
        //先时间代理  再日志代理  再坦克类
        new TimeProxy(new LogProxy(new Tank())).move();
    }

    @Test
    public void test2(){
        //先日志代理  再时间代理  再坦克类
        new LogProxy(new TimeProxy(new Tank())).move();
    }
}
