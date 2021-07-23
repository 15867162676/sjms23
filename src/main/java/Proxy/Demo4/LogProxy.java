package Proxy.Demo4;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @author TF014268
 * @description 打日志的代理
 * @since 2021/7/21 0021 15:40
 */
public class LogProxy implements MethodInterceptor {

    private void before(Method method){
        System.out.println("method：" + method.getName() + "开始了");
    }

    private void after(Method method){
        System.out.println("method：" + method.getName() + "结束了");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("打印类名称：" + o.getClass().getName());
        System.out.println("打印父类名称：" + o.getClass().getSuperclass().getName());
        before(method);
        Object object = methodProxy.invokeSuper(o,objects);
        after(method);
        return object;
    }
}
