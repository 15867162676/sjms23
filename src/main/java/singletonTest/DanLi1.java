package singletonTest;
/**
 * 饿汉式，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 * （期望；用到的时候再实例化）
 * */
public class DanLi1 {
    private static final DanLi1 INSTANCE = new DanLi1();

    //构造方法必须为私有的，这样就不会new出来这个类
    private DanLi1(){}

    //获取单例的方法
    public static DanLi1 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        DanLi1 a1 = DanLi1.getInstance();
        DanLi1 a2 = DanLi1.getInstance();
        System.out.println(a1 == a2);
    }
}