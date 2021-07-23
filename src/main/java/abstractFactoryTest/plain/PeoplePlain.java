package abstractFactoryTest.plain;

import abstractFactoryTest.abstractClass.Food;
import abstractFactoryTest.abstractClass.Live;
import abstractFactoryTest.abstractClass.PersonAbstractFactory;
import abstractFactoryTest.abstractClass.Run;

//普通人
public class PeoplePlain extends PersonAbstractFactory {

    @Override
    public Food createFood() {
        return new Egg();
    }
    @Override
    public Live createLive() {
        return new Floor();
    }
    @Override
    public Run createRun() {
        return new Car();
    }
}
