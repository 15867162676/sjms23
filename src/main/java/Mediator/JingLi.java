package Mediator;

/**
 * @author TF014268
 * @description 调停者类--经理
 * @since 2021/6/22 0022 14:51
 */
public class JingLi implements Mediator{
    @Override
    public void change(String message, ZhiYuan zhiYuan, String name) {
        System.out.println("经理收到" + name + "的需求：" + message);
        System.out.println("经理将" + name + "的需求发送给目标职员");
        zhiYuan.called(message,name);
    }
}
