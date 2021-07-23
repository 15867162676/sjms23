package Command;

/**
 * @author TF014268
 * @description 增加命令
 * @since 2021/7/8 0008 9:17
 */
public class InsertCommand extends Command{
    Content content;
    String str="123";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + str;
    }

    //撤回
    @Override
    public void undo() {
        content.msg = content.msg.substring(0,content.msg.length()-str.length());
    }
}
