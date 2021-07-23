package State.Demo1;

/**
 * @author TF014268
 * @description
 * @since 2021/7/20 0020 10:32
 */
public class NoonState extends MyState {
    @Override
    public void WriteProgram(MyWork myWork) {
        if(myWork.getHour() < 13){
            System.out.println("当前时间：" + myWork.getHour() + "，该吃午饭和午睡了");
        }else{
            //超过13点，转到下午工作状态
            myWork.setMyState(new AfterNoonState());
            myWork.WriteProgram();
        }
    }
}
