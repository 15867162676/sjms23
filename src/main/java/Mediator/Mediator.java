package Mediator;

/**
 * @author TF014268
 * @description 调停者接口
 * @since 2021/6/22 0022 14:46
 */
public interface Mediator {
    /**
     * @param message  消息内容
     * @param zhiYuan  接收消息的职员
     * @param name   发送消息的职员姓名
     */
    void change(String message,ZhiYuan zhiYuan,String name);
}
