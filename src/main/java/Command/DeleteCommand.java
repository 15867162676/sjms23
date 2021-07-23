package Command;

/**
 * @author TF014268
 * @description 删除命令
 * @since 2021/7/8 0008 9:23
 */
public class DeleteCommand extends Command{
    Content content;
    //删除的内容
    String deleted;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        //删除前面的内容
        deleted = content.msg.substring(0,5);
        content.msg = content.msg.substring(5,content.msg.length());
    }

    @Override
    public void undo() {
        content.msg = deleted + content.msg;
    }
}
