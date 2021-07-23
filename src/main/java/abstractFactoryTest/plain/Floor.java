package abstractFactoryTest.plain;

import abstractFactoryTest.abstractClass.Live;

public class Floor extends Live {
    @Override
    public void live() {
        System.out.println("普通人住高楼");
    }
}
