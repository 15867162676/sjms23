package State.Demo1;

/**
 * @author TF014268
 * @description 上午工作状态
 * @since 2021/7/20 0020 10:28
 */
public class ForenoonState extends MyState {
    @Override
    public void WriteProgram(MyWork myWork) {
        if(myWork.getHour() < 12){
            System.out.println("当前时间：" + myWork.getHour() + "，工作效率高");
        }else{
            //超过12点，转到中午工作的状态
            myWork.setMyState(new NoonState());
            myWork.WriteProgram();
        }

    }
}
