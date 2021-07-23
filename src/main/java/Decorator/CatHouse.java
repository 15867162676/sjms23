package Decorator;

/**
 * @author TF014268
 * @description 猫的房子
 * @since 2021/6/22 0022 16:06
 */
public class CatHouse implements House{
    @Override
    public void output() {
        System.out.println("猫的房子");
    }
}
