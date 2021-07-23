package State.Demo1;

/**
 * @author TF014268
 * @description
 * @since 2021/7/20 0020 10:35
 */
public class NightState extends MyState {

    @Override
    public void WriteProgram(MyWork myWork) {
        System.out.println("当前时间：" + myWork.getHour() + "，晚上不加班，回家睡觉");
    }
}
