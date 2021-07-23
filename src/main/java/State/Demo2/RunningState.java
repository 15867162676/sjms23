package State.Demo2;

/**
 * @author TF014268
 * @description 电梯运行中类
 * @since 2021/7/20 0020 14:05
 * 当电梯处于运行状态时，此时当然是不能开门的；而门肯定是关了的，所以也不必执行关门方法；
 * 此时电梯可以从运行状态转变为停止状态。
 */
public class RunningState extends LiftState{
    //运行时不能开门
    @Override
    public void open() {
        //什么都不做
    }

    //运行时门肯定是关的
    @Override
    public void close() {
        //什么都不做
    }

    // * 执行运行方法
    @Override
    public void run() {
        System.out.println("电梯运行中");
    }

    //运行后可以停止
    @Override
    public void stop() {
        //环境设置为停止状态
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
