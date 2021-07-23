package Visitor.Test2;

/**
 * @author TF014268
 * @description 访问者接口
 * @since 2021/7/1 0001 8:47
 */
public interface CorporateSlave {
    void accept(CorporateSlaveVisitor visitor);
}
