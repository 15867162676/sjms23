package abstractFactoryTest.plain;

import abstractFactoryTest.abstractClass.Food;

public class Egg extends Food {

    @Override
    public void eat() {
        System.out.println("普通人吃鸡蛋");
    }
}
