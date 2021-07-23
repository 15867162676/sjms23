package FactoryMethodTest2;

public class Test {
    public static void main(String[] args) {
        Moveable car = new CarFactory().create();
        car.go();  //开car
        Moveable plane = new PlaneFactory().create();
        plane.go();  //开飞机
    }
}
