package abstractFactoryTest.abstractClass;
//人的抽象工厂类
public abstract class PersonAbstractFactory {
    public abstract Food createFood();  //吃
    public abstract Live createLive();  //住
    public abstract Run createRun();  //行
}
