package singletonTest;
/**
 * 跟饿汉式是一样的
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 * */
public class DanLi2 {
    private static final DanLi2 INSTANCE;
    static{
        INSTANCE = new DanLi2();
    }

    private DanLi2(){}

    public static DanLi2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        DanLi2 a1 = DanLi2.getInstance();
        DanLi2 a2 = DanLi2.getInstance();
        System.out.println(a1 == a2);
    }
}
