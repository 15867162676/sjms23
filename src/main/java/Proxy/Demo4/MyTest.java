package Proxy.Demo4;

import org.springframework.cglib.proxy.Enhancer;

public class MyTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置父类,那么enhancer就能拿到父类中的方法
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogProxy());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
