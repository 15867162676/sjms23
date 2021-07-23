package FactoryMethodTest2;

public class PlaneFactory {
    public Moveable create(){  //轿车
        return new Plane();
    }
}
