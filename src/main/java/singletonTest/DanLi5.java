package singletonTest;
/**
 * 加synchronized关键字
 * 为了提高效率，缩小同步代码块的范围
 * */
public class DanLi5 {
    private static DanLi5 INSTANCE;

    private DanLi5(){}

    private static DanLi5 getInstance(){
        if(INSTANCE == null){
            //当线程A走进来后，加锁然后sleep  这时线程B判断INSTANCE也为null也走了进来
            //B等锁释放后也会往下走
            //最后线程A和线程B都创建了实例
            synchronized(DanLi5.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new DanLi5();
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(() -> {
                System.out.println(DanLi5.getInstance().hashCode());
            }).start();
        }
    }
}
