package State.Demo2;

/**
 * @author TF014268
 * @description 电梯状态抽象类
 * @since 2021/7/20 0020 13:55
 */
public abstract class LiftState {

    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    //电梯门开启动作
    public abstract void open();
    //电梯门关闭动作
    public abstract void close();
    //电梯运行
    public abstract void run();
    //电梯停止
    public abstract void stop();
}
