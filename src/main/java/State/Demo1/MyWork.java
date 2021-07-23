package State.Demo1;

/**
 * @author TF014268
 * @description 工作类
 * @since 2021/7/20 0020 10:21
 */
public class MyWork {
    //当前状态
    private MyState myState;
    //时间
    private double hour;
    //任务完成标识（1完成  0未完成）
    private boolean finish;

    public MyWork(){
        //设置初始状态为上午工作状态
        myState = new ForenoonState();
    }

    public MyState getMyState() {
        return myState;
    }

    public void setMyState(MyState myState) {
        this.myState = myState;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    //执行当前状态
    public void WriteProgram(){
        myState.WriteProgram(this);
    }
}
