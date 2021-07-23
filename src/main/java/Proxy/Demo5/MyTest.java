package Proxy.Demo5;

import java.lang.reflect.Proxy;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/20 0020 19:25
 */
public class MyTest {

    public static void main(String[] args) {
        //此设置必须在main方法中，
        //注意属性值是字符串true,而不是布尔值true.
        //设置此属性可以展示出生成的动态代理类
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Tank tank = new Tank();

        MyProxy myProxy = (MyProxy) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{MyProxy.class}, new LogProxy(tank));
        myProxy.move();
        System.out.println("-----------分割线--------------");

        myProxy = (MyProxy) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{MyProxy.class}, new LogProxy(new Cat()));
        myProxy.move();
    }

}
