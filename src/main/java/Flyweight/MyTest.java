package Flyweight;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/23 0023 17:05
 */
public class MyTest {

    @Test
    public void test1(){
         /*在java中，所有的字符串都放在一个常量池中，
         每个字符串在常量池中是唯一的，
         a1和a2指向的都是常量池中的abc
         当创建字符串时，先判断常量池中是否有这个字符串，有的话直接指向它；
         没有的话，就new一个
         */
        String a1 = "abc";
        String a2 = "abc";

        /*使用new，就是在堆中开辟了一块地址，
        a3和a4都各自在堆中开辟一块地址，所以a3==a4为false
        a3和a4的地址指向的都是常量池中的常量
        */
        String a3 = new String("abc");
        String a4 = new String("abc");

        //intern()方法，返回的就是常量池中的值

        System.out.println(a1==a2);//true
        System.out.println(a1==a3);//false
        System.out.println(a3==a4);//false
        System.out.println(a1==a3.intern());//true
        System.out.println(a4.intern()==a3.intern());//true
    }

    @Test
    public void test2(){
        BulletPool bulletPool = new BulletPool();
        for(int i=0;i<10;i++){
            Bullet bullet = bulletPool.getBullet();
            System.out.println(bullet);
        }
    }
}
