package singletonTest;

public class DanLi6 {
    private static DanLi6 INSTANCE;

    private DanLi6(){}

    private static DanLi6 getInstance(){
        if(INSTANCE == null){  //如果不为null,直接返回
            synchronized(DanLi6.class){
                if(INSTANCE == null){  //在同步代码块里校验为null才去创建
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new DanLi6();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(() -> {
                System.out.println(DanLi6.getInstance().hashCode());
            }).start();
        }
    }
}
