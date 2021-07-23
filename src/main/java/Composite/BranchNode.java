package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 节点类(下面可以有叶子 ， 也可以有节点)
 * @since 2021/6/23 0023 10:44
 */
public class BranchNode extends Node{
    //子节点既可以为节点也可以为叶子
    private List<Node> nodes = new ArrayList();

    private String name;
    public BranchNode(String name){
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }

    //添加子节点或子叶子
    public void add(Node node){
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
