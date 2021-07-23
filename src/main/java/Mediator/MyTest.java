package Mediator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/22 0022 14:56
 */
public class MyTest {

    @Test
    public void test1(){
        //分配职员与经理
        Mediator jingli = new JingLi();
        ZhiYuan zhiyuanA = new ZhiYuanA(jingli,"职员A");
        ZhiYuan zhiyuanB = new ZhiYuanB(jingli,"职员B");
        ZhiYuan zhiyuanC = new ZhiYuanC(jingli,"职员C");

        System.out.println("职员A的需求,需要职员B来处理-------------");
        //职员A的需求
        String messageA = "这些资料需要B职员操作";
        zhiyuanA.call(messageA,zhiyuanB,zhiyuanA.name);

        System.out.println("职员C的需求,需要职员B来处理-------------");
        //职员C的请求
        String messageC = "这些资料需要B职员签名";
        zhiyuanC.call(messageC, zhiyuanB,zhiyuanC.name);
    }
}
