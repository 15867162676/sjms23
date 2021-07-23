package FactoryMethodTest2;

public class CarFactory {
    public Moveable create(){  //轿车
        return new Car();
    }
}
