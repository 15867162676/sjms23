package Visitor;

/**
 * @author TF014268
 * @description Monitor
 * @since 2021/6/28 0028 17:15
 */
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
