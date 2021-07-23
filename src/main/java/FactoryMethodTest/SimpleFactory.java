package FactoryMethodTest;
/**
 * 简单工厂   扩展性不好
 * 如果要再加类型，还需要改动此方法
 * */
public class SimpleFactory {
    public Car createCar(){  //轿车
        return new Car();
    }

    public Plane createPlane(){  //飞机
        return new Plane();
    }
}
