package Iterator.Test1;

/**
 * @author TF014268
 * @description node元素类
 * @since 2021/6/25 0025 17:17
 */
public class Node {
    //当前元素
    private Object object;
    //下一个元素
    Node next;

    public Node(Object object){
        this.object=object;
    }
}
