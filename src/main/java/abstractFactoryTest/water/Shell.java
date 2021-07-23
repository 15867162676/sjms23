package abstractFactoryTest.water;

import abstractFactoryTest.abstractClass.Live;

public class Shell extends Live {
    @Override
    public void live() {
        System.out.println("水族人住在贝壳里");
    }
}
