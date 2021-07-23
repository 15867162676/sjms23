package singletonTest;
/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类的时候不会加载内部类，这样可以实现懒加载
 * */
public class DanLi7 {

    private DanLi7(){
        System.out.println("单例类创建了");
    }

    //内部类
    private static class DanLi7Holder{
        private final static DanLi7 INSTANCE = new DanLi7();
    }

    public static DanLi7 getInstance(){
        System.out.println("调用getInstance()");
        return DanLi7Holder.INSTANCE;
    }

    public static void main(String[] args) {
        //当外部类加载后，内部类是不是加载的
        //当调用了DanLi7.getInstance()方法时，才会去执行DanLi7Holder.INSTANCE
        //加载内部类，创建DanLi7实例
        for(int i=0;i<1;i++){
            new Thread(() -> {
                System.out.println(DanLi7.getInstance().hashCode());
            }).start();
            System.out.println("-----------------------");
        }
    }
}
