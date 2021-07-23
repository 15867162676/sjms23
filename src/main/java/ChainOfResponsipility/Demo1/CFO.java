package ChainOfResponsipility.Demo1;

/**
 * @author TF014268
 * @description 首席财务官
 * @since 2021/7/14 0014 15:27
 */
public class CFO implements BudgetHandler{
    //下一个处理器
    private BudgetHandler nextHandler;

    //最后一个处理器没有下一个
    public CFO() {
        System.out.println("CFO初始化-------");
        setNextHandler(null);
    }

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean handle(int amount) {
        if(amount<50000){
            System.out.println("CFO同意,希望你再接再厉，为公司做出更大的贡献。");
            return true;
        }
        if (nextHandler!=null){
            //如果还有下一个，就转交给下一个
            return nextHandler.handle(amount);
        }
        //已经没有更高级的管理层来处理了
        System.out.println(String.format("%d太多了，回去好好看看能不能缩减一下",amount));
        return false;
    }
}
