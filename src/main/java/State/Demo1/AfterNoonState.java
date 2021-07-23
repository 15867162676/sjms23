package State.Demo1;

/**
 * @author TF014268
 * @description
 * @since 2021/7/20 0020 10:34
 */
public class AfterNoonState extends MyState {
    @Override
    public void WriteProgram(MyWork myWork) {
        if(myWork.getHour() < 18){
            System.out.println("当前时间：" + myWork.getHour() + "，下午工作开始了");
        }else{
            //超过18点，转到晚上工作状态
            myWork.setMyState(new NightState());
            myWork.WriteProgram();
        }
    }
}
