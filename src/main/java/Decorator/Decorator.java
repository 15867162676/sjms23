package Decorator;

/**
 * @author TF014268
 * @description 装饰器类
 * @since 2021/6/22 0022 16:08
 */
public class Decorator implements House{
    House house;
    public Decorator(House house){
        this.house = house;
    }
    @Override
    public void output() {
        System.out.println("房子处理前装饰门牌号");
        house.output();
        System.out.println("房子处理后装饰点花花草草");
    }
}
