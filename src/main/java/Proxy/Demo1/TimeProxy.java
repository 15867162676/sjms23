package Proxy.Demo1;

/**
 * @author TF014268
 * @description 坦克所用时间代理
 * @since 2021/7/20 0020 19:18
 */
public class TimeProxy implements MyProxy{
    private MyProxy myProxy;

    public TimeProxy(MyProxy myProxy) {
        this.myProxy = myProxy;
    }

    @Override
    public void move() {
        System.out.println("时间代理开始***");
        long start = System.currentTimeMillis();
        myProxy.move();
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end-start));
        System.out.println("时间代理结束***");
    }
}
