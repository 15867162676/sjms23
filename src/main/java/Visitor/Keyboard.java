package Visitor;

/**
 * @author TF014268
 * @description Keyboard
 * @since 2021/6/28 0028 17:14
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
