package Facade;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/22 0022 11:18
 */
public class MyTest {

    @Test
    public void test1(){
        Facader facader = new Facader();
        System.out.println("-------业务场景1-------");
        //业务场景1
        facader.business1();
        System.out.println("--------业务场景2------");
        //业务场景2
        facader.business2();
    }

}
