package FactoryMethodTest;

public class Plane implements Moveable{
    @Override
    public void go() {
        System.out.println("开飞机上班");
    }
}
