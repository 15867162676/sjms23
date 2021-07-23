package Proxy.Demo5;

/**
 * @author TF014268
 * @description 猫
 * @since 2021/7/23 0023 10:22
 */
public class Cat implements MyProxy{
    @Override
    public void move() {
        System.out.println("小猫~~~喵喵喵");
    }
}
