package Builder.test1;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/30 0030 19:13
 */
public class MyTest {

    @Test
    public void test1(){
        /**
         * 首先生成一个director (1)，
         * 然后生成一个目标builder (2)，
         * 接着使用director组装builder (3),
         * 组装完毕后使用builder创建产品实例 (4)
         */
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder builder=new MacComputerBuilder("I5处理器","三星125");//2
        computerDirector.makeComputer(builder);//3
        Computer macComputer=builder.getComputer();//4
        System.out.println("mac computer:"+macComputer.toString());

        ComputerBuilder lenovoBuilder=new LenovoComputerBuilder("I7处理器","海力士222");
        computerDirector.makeComputer(lenovoBuilder);
        Computer lenovoComputer=lenovoBuilder.getComputer();
        System.out.println("lenovo computer:"+lenovoComputer.toString());

    }
}
