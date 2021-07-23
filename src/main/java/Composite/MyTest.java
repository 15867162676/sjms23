package Composite;

import org.junit.Test;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/23 0023 11:14
 */
public class MyTest {

    @Test
    public void test1(){
        //设置根
        BranchNode root = new BranchNode("root");
        //设置rootSon1---------------------
        BranchNode rootSon1 = new BranchNode("a.text");
        //把rootSon1添加到根上
        root.add(rootSon1);

        //设置rootSon1的子
        Node a1 = new LeafNode("a1.jpg");
        Node a2 = new LeafNode("a2.html");
        rootSon1.add(a1);
        rootSon1.add(a2);

        //设置rootSon2---------------------
        BranchNode rootSon2 = new BranchNode("b");
        //把rootSon2添加到根上
        root.add(rootSon2);
        Node b1 = new LeafNode("b1.jpeg");
        rootSon2.add(b1);
        BranchNode b2 = new BranchNode("b2");
        rootSon2.add(b2);
        Node b22 = new LeafNode("b22.text");
        b2.add(b22);

        //输出树结构
        tree(root,0);
    }

    //使用递归，打印树结构
    private void tree(Node node, int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("--");
        }
        node.p();
        if(node instanceof BranchNode){
            for(Node n : ((BranchNode)node).getNodes()){
                tree(n,depth+1);
            }
        }
    }
}
