package prototype.Demo1;

/**
 * @author TF014268
 * @description 人类
 * @since 2021/7/16 0016 17:10
 */
//实现标记型接口  不然会抛异常CloneNotSupportedException
public class Person implements Cloneable{
    //姓名
    String name = "张三";
    //年龄
    int age = 25;

    Location location = new Location("北京",1);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                '}';
    }
}
