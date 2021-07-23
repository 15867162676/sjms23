package Proxy.Demo1;

/**
 * @author TF014268
 * @description 坦克的日志代理
 * @since 2021/7/20 0020 19:24
 */
public class LogProxy implements MyProxy{
    private MyProxy myProxy;

    public LogProxy(MyProxy myProxy) {
        this.myProxy = myProxy;
    }

    @Override
    public void move() {
        System.out.println("执行前的日志------");
        myProxy.move();
        System.out.println("执行后的日志------");
    }
}
