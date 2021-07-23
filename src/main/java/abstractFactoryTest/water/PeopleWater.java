package abstractFactoryTest.water;

import abstractFactoryTest.abstractClass.Food;
import abstractFactoryTest.abstractClass.Live;
import abstractFactoryTest.abstractClass.PersonAbstractFactory;
import abstractFactoryTest.abstractClass.Run;

//水族人
public class PeopleWater extends PersonAbstractFactory {
    @Override
    public Food createFood() {
        return new Fish();
    }
    @Override
    public Live createLive() {
        return new Shell();
    }
    @Override
    public Run createRun() {
        return new Foot();
    }
}
