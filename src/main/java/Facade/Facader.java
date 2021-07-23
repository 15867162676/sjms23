package Facade;

/**
 * @author TF014268
 * @description 外观类
 * @since 2021/6/22 0022 11:16
 */
public class Facader {
    private Sub1 sub1 = new Sub1();
    private Sub2 sub2 = new Sub2();
    private Sub3 sub3 = new Sub3();

    //业务场景1
    public void business1(){
        sub1.fa1();
        sub2.fa2();
    }

    //业务场景2
    public void business2(){
        sub1.fa1();
        sub3.fa3();
    }
}
