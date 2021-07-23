package Mediator;

/**
 * @author TF014268
 * @description 职员抽象类
 * @since 2021/6/22 0022 14:47
 */
public abstract class ZhiYuan {
    //职员姓名
    String name;
    //调停者
    private Mediator mediator;

    public ZhiYuan(Mediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }

    //提供给 调停者 调用的方法。接收被分配的任务
    public void called(String message,String name2){
        System.out.println(name + "接收到来自"+ name2 + "的需求：" + message);
    }

    //调用  调停者 ,让其去协调任务分配
    public void call(String message,ZhiYuan zhiyuan,String name2){
        System.out.println(name2 + "发起需求："+ message);
        mediator.change(message,zhiyuan,name2);
    }
}
