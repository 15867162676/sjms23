package Proxy.Demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author TF014268
 * @description 打日志的代理
 * @since 2021/7/21 0021 15:40
 */
public class LogProxy implements InvocationHandler {
    private Tank tank;

    public LogProxy(Tank tank) {
        this.tank = tank;
    }

    private void before(Method method){
        System.out.println("method：" + method.getName() + "开始了");
    }

    private void after(Method method){
        System.out.println("method：" + method.getName() + "结束了");
    }

    /**
     *
     * @param proxy  生成的动态代理类
     * @param method  方法
     * @param args   参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object object = method.invoke(tank,args);
        after(method);
        return object;
    }
}
