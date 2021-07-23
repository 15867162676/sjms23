package Iterator.Test1;

/**
 * @author TF014268
 * @description 链式存储
 * @since 2021/6/25 0025 17:16
 */
public class MyLinkedList implements MyCollection{
    //第一个元素
    Node head = null;
    //最后一个元素
    Node tail = null;
    //记录list中的元素个数
    private int size = 0;

    @Override
    public void add(Object object) {
        //先创建出来最后一个元素
        Node node = new Node(object);
        node.next=null;

        if(head==null){
            //list中还没有元素
            head = node;
            tail = node;
        }

        tail.next=node;
        tail=node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }
}
