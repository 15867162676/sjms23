package Visitor.Test2;

/**
 * @author TF014268
 * @description
 * @since 2021/7/1 0001 8:51
 */
public class HumanSource implements CorporateSlave{
    private String name;

    public HumanSource(String name) {
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
