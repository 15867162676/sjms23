package Visitor.Test2;

/**
 * @author TF014268
 * @description
 * @since 2021/7/1 0001 8:53
 */
public class Tester implements CorporateSlave{
    private String name;

    public Tester(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(CorporateSlaveVisitor visitor) {
        visitor.visit(this);
    }
}
