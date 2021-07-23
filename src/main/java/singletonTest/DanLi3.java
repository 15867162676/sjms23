package singletonTest;
/**
 * lazy loading
 * 懒汉式
 * 虽然实现了用到了再实例化，但是带来了更大的问题
 * 多线程的时候会有问题
 * */
public class DanLi3 {
    private static DanLi3 INSTANCE;

    private DanLi3(){}

    public static DanLi3 getInstance(){
        if(INSTANCE == null){
            //当线程A走进来后，sleep  这时线程B判断INSTANCE也为null也走了进来
            //最后线程A和线程B都创建了实例
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new DanLi3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(() -> {
                System.out.println(DanLi3.getInstance().hashCode());
            }).start();
        }
    }
}
