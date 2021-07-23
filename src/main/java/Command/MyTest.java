package Command;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/7/8 0008 9:28
 */
public class MyTest {

    @Test
    public void test1(){
        Content content = new Content();

        System.out.println("新增命令的doit和undo-------------");
        Command insert = new InsertCommand(content);
        insert.doit();
        System.out.println(content.msg);
        insert.undo();
        System.out.println(content.msg);

        System.out.println("复制命令的doit和undo-------------");
        Command copy = new CopyCommand(content);
        copy.doit();
        System.out.println(content.msg);
        copy.undo();
        System.out.println(content.msg);

        System.out.println("删除命令的doit和undo-------------");
        Command deleted = new DeleteCommand(content);
        deleted.doit();
        System.out.println(content.msg);
        deleted.undo();
        System.out.println(content.msg);
    }
}
