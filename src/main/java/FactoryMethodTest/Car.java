package FactoryMethodTest;

public class Car implements Moveable{
    @Override
    public void go() {
        System.out.println("开Car上班");
    }
}
