package Visitor;

/**
 * @author TF014268
 * @description 接口
 * @since 2021/6/28 0028 17:10
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
