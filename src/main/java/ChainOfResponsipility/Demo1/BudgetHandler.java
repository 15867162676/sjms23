package ChainOfResponsipility.Demo1;

/**
 * @author TF014268
 * @description 处理器接口
 * @since 2021/7/14 0014 15:12
 */
public interface BudgetHandler {
    //设置下一个处理器
    void setNextHandler(BudgetHandler nextHandler);

    //处理业务
    boolean handle(int amount);
}
