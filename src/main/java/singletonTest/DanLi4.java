package singletonTest;
/**
 * 加synchronized关键字
 * 虽然解决了懒汉式的问题，但是带来了效率下降
 * */
public class DanLi4 {
    private static DanLi4 INSTANCE;

    private DanLi4(){}

    private static synchronized DanLi4 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new DanLi4();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(() -> {
                System.out.println(DanLi4.getInstance().hashCode());
            }).start();
        }
    }
}
