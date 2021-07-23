package abstractFactoryTest;

import abstractFactoryTest.abstractClass.PersonAbstractFactory;
import abstractFactoryTest.plain.PeoplePlain;
import abstractFactoryTest.water.PeopleWater;

public class Test {
    public static void main(String[] args) {
        System.out.println("普通人----------------");
        PersonAbstractFactory p = new PeoplePlain();
        p.createFood().eat();
        p.createLive().live();
        p.createRun().go();

        System.out.println("水族人----------------");
        PersonAbstractFactory p2 = new PeopleWater();
        p2.createFood().eat();
        p2.createLive().live();
        p2.createRun().go();
    }
}
