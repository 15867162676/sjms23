package Proxy.Demo2;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/20 0020 19:25
 */
public class MyTest {
    @Test
    public void test1(){
        Tank tank = new Tank();

        /*
        使用java反射包中的java.lang.reflect.Proxy
        reflection通过二进制字节码分析类的属性和方法
        Proxy.newProxyInstance  产生新的代理
        static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) throws IllegalArgumentException
        -- ClassLoader loader的类型和返回值一样即可。  含义是：你需要用哪个loader把new出来的代理对象给落到内存。
        -- Class<?>[] interfaces  含义是：new出来的代理对象应该实现哪些接口，是个数组。
        -- InvocationHandler h  调用时的处理器，指的是  被代理对象的方法  被调用的时候  我们怎么做处理。
         */
        MyProxy myProxy = (MyProxy) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{MyProxy.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method：" + method.getName() + "开始了");
                Object object = method.invoke(tank,args);
                System.out.println("method：" + method.getName() + "结束了");
                return object;
            }
        });

        myProxy.move();
    }
}
