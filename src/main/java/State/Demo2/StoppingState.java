package State.Demo2;

/**
 * @author TF014268
 * @description 电梯停止类
 * @since 2021/7/20 0020 14:06
 * 当电梯处于停止状态时，门是关闭着的，所以不能执行关门的方法；
 * 但此时是可以开门的；而停止后电梯也可以再度运行，所以存在run()方法。
 */
public class StoppingState extends LiftState{
    //停下了要开门
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    //门本来就是关着的
    @Override
    public void close() {
        //什么都不做
    }

    //停止后可以再运行
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    //执行停止方法
    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
