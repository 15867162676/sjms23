package State.Demo2;

/**
 * @author TF014268
 * @description 电梯开门状态类
 * @since 2021/7/20 0020 13:59
 * 对于开门状态，除去自身的开启电梯门的方法之外，在打开门之后应该还具备关闭电梯门的功能，
 * 而门开着的时候是不能运行也不能停止的。
 */
public class OpenningState extends LiftState{
    //执行打开电梯门方法
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    //打开后还可以关闭电梯门
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getLiftState().close();
    }

    //门开着不能运行
    @Override
    public void run() {
        //什么都不做
    }

    //门开着已经停止了
    @Override
    public void stop() {
        //什么都不做
    }
}
