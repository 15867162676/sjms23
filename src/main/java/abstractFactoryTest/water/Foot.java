package abstractFactoryTest.water;

import abstractFactoryTest.abstractClass.Run;

public class Foot extends Run {
    @Override
    public void go() {
        System.out.println("水族人用脚运动");
    }
}
