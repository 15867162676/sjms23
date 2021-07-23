package Iterator.Test2;

/**
 * @author TF014268
 * @description 具体聚集类
 * @since 2021/6/28 0028 15:12
 */
public class ConcreteAggregate extends Aggregate<String>{

    @Override
    public MyIterator<String> createMyIterator() {
        return null;
    }
}
