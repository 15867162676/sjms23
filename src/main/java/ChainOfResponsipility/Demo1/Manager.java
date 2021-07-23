package ChainOfResponsipility.Demo1;

import java.util.Objects;

/**
 * @author TF014268
 * @description 部门经理
 * @since 2021/7/14 0014 15:19
 */
public class Manager implements BudgetHandler{
    //下一个处理器
    private BudgetHandler nextHandler;

    public Manager(){
        System.out.println("Manager初始化-------");
        setNextHandler(new CFO());
    }

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);
        if(amount<5000){
            System.out.println("小于5000块，我这个经理可以决定：同意！");
            return true;
        }
        System.out.println(String.format("%d超出Manager权限,请更高级管理层批复",amount));
        //调用下一个处理器来处理业务
        return nextHandler.handle(amount);
    }
}
