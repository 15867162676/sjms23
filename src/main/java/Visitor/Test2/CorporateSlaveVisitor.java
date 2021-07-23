package Visitor.Test2;

/**
 * @author TF014268
 * @description
 * @since 2021/7/1 0001 8:51
 */
public interface CorporateSlaveVisitor {
    void visit(Programmer programmer);

    void visit(HumanSource humanSource);

    void visit(Tester tester);
}
