package Visitor.Test2;

/**
 * @author TF014268
 * @description 社交APP
 * @since 2021/7/1 0001 8:58
 */
public class SocialApp implements CorporateSlaveVisitor{
    @Override
    public void visit(Programmer programmer) {
        System.out.println(programmer.getName() + "开发社交app");
    }

    @Override
    public void visit(HumanSource humanSource) {
        System.out.println(humanSource.getName() + "充当推广社交app");
    }

    @Override
    public void visit(Tester tester) {
        System.out.println(tester.getName() + "测试社交app");
    }
}
