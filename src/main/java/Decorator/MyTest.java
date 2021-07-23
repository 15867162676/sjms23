package Decorator;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/22 0022 16:13
 */
public class MyTest {
    @Test
    public void test1(){
        System.out.println("给猫的房子加点装饰------------");
        House catHouse = new CatHouse();
        Decorator decorator = new Decorator(catHouse);
        decorator.output();

        System.out.println("-------------------");
        System.out.println("给加过装饰的猫的房子加大-------------");
        House bigHouse = new BigHouse(decorator);
        bigHouse.output();
    }
}
