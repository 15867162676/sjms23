package Bridge;


import org.junit.Test;

/**
 * @author TF014268
 * @description 测试类
 * @since 2021/6/18 0018 14:42
 */
public class MyTest1 {

    @Test
    public void myTest1(){
        //红色的长方形
        YanSe red = new Red();
        Shape chang = new Chang();
        //设置为红色
        chang.setYanSe(red);
        chang.printShape();
        System.out.println("---------------------");

        YanSe blue = new Blue();
        chang.setYanSe(blue);
        chang.printShape();

    }

    @Test
    public void myTest2(){
        //红色的长方形
        YanSe red = new Red();
        Shape chang = new Chang();
        Material gold = new Gold();
        //设置为红色
        chang.setYanSe(red);
        //设置为金质
        chang.setMaterial(gold);

        chang.printShape();
        System.out.println("---------------------");

        //白色的长方形
        YanSe white = new White();
        Material silver = new Silver();
        //设置为白色
        chang.setYanSe(white);
        //设置为银质
        chang.setMaterial(silver);
        chang.printShape();
    }
}
