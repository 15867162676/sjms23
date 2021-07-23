package Decorator;

/**
 * @author TF014268
 * @description 狗的房子
 * @since 2021/6/22 0022 16:07
 */
public class DogHouse implements House{
    @Override
    public void output() {
        System.out.println("狗的房子");
    }
}
