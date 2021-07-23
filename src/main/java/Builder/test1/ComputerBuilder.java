package Builder.test1;

/**
 * @author TF014268
 * @description 抽象构建者类
 * @since 2021/6/30 0030 8:30
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    //获取Computer对象
    public abstract Computer getComputer();
}
