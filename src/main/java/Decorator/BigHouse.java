package Decorator;

/**
 * @author TF014268
 * @description 大房子
 * @since 2021/6/22 0022 16:13
 */
public class BigHouse implements House{
    House house;
    public BigHouse(House house){
        this.house = house;
    }

    @Override
    public void output() {
        System.out.println("这是一个大房子");
        house.output();
    }
}
