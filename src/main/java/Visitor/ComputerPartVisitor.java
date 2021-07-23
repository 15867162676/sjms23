package Visitor;

/**
 * @author TF014268
 * @description
 * @since 2021/6/28 0028 17:11
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
