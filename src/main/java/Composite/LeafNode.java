package Composite;

/**
 * @author TF014268
 * @description 叶子节点类
 * @since 2021/6/23 0023 10:41
 */
public class LeafNode extends Node{
    private String content;

    public LeafNode(String content){
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println(content);
    }
}
