package Visitor.Test2;

/**
 * @author TF014268
 * @description 程序员
 * @since 2021/7/1 0001 8:49
 */
public class Programmer implements CorporateSlave{
    private String name;

    public Programmer(String name) {
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
