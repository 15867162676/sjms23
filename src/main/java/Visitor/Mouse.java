package Visitor;

/**
 * @author TF014268
 * @description Mouse
 * @since 2021/6/28 0028 17:16
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
