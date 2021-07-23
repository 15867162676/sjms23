package Proxy.Demo1;

/**
 * @author TF014268
 * @description 坦克类
 * @since 2021/7/20 0020 19:15
 */
public class Tank implements MyProxy {

    @Override
    public void move(){
        System.out.println("坦克开始工作了++++++++++++++");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
