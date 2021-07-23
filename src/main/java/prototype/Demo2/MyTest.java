package prototype.Demo2;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/16 0016 17:14
 */
public class MyTest {
    @Test
    public void test1() throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);

        System.out.println("------p1.location == p2.location?------");
        System.out.println(p1.location == p2.location);

        System.out.println("------修改p1--李四--30--上海--3-------");
        p1.name = "李四";
        p1.age = 30;
        p1.location.adress = "上海";
        p1.location.roomNumber = 3;
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
    }
}
