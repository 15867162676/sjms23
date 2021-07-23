package prototype.Demo3;

import org.junit.Test;

import java.io.*;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/16 0016 17:14
 */
public class MyTest {
    @Test
    public void test1() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Person p1 = new Person();
        System.out.println("p1=" + p1);

        //通过序列化方法实现深拷贝
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(p1);
        oos.flush();

        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Person p2=(Person)ois.readObject();
        System.out.println("p2=" + p2);

//        System.out.println("------p1.location == p2.location?------");
//        System.out.println(p1.location == p2.location);

        System.out.println("------修改p1--李四--30--上海--3-------");
//        p1.name = "李四";
        p1.age = 30;
//        p1.location.adress = "上海";
//        p1.location.roomNumber = 3;
        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
    }
}
