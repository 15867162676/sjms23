package FactoryMethodTest;

public class Test {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        sf.createCar().go();
        sf.createPlane().go();
    }
}
