package Command;

/**
 * @author TF014268
 * @description 复制命令
 * @since 2021/7/8 0008 9:20
 */
public class CopyCommand extends Command{
    Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg = content.msg + content.msg;
    }

    //撤回
    @Override
    public void undo() {
        content.msg = content.msg.substring(0,content.msg.length()/2);
    }
}
