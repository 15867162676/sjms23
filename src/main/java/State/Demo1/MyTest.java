package State.Demo1;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/20 0020 10:37
 */
public class MyTest {
    @Test
    public void test1(){
        MyWork myWork = new MyWork();

        //设置时间
        myWork.setHour(8);
        //调用工作状态
        myWork.WriteProgram();
        System.out.println("------------");

        myWork.setHour(12);
        myWork.WriteProgram();
        System.out.println("------------");

        myWork.setHour(15);
        myWork.WriteProgram();
        System.out.println("------------");

        myWork.setHour(21);
        myWork.WriteProgram();
    }
}
