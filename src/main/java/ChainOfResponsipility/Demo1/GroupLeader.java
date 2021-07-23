package ChainOfResponsipility.Demo1;

import java.util.Objects;

/**
 * @author TF014268
 * @description 小组领导
 * @since 2021/7/14 0014 15:17
 */
public class GroupLeader implements BudgetHandler{
    //下一个处理器
    private BudgetHandler nextHandler;

    //在构造方法中设置下一个处理器
    public GroupLeader(){
        System.out.println("GroupLeader初始化-------");
        setNextHandler(new Manager());
    }

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        Objects.requireNonNull(nextHandler);
        if(amount<1000){
            System.out.println("小钱，批了！");
            return true;
        }
        System.out.println(String.format("%d超出GroupLeader权限,请更高级管理层批复",amount));
        //调用下一个处理器来处理业务
        return nextHandler.handle(amount);
    }
}
