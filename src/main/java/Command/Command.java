package Command;

/**
 * @author TF014268
 * @description 命令抽象类
 * @since 2021/7/8 0008 9:13
 */
public abstract class Command {
    //执行命令
    public abstract void doit();

    //撤回命令
    public abstract void undo();

}
