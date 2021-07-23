package abstractFactoryTest.water;

import abstractFactoryTest.abstractClass.Food;

public class Fish extends Food {
    @Override
    public void eat() {
        System.out.println("水族人吃鱼");
    }
}
