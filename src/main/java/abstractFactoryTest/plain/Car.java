package abstractFactoryTest.plain;

import abstractFactoryTest.abstractClass.Run;

public class Car extends Run {
    @Override
    public void go() {
        System.out.println("普通人开轿车");
    }
}
