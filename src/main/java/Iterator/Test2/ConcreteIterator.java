package Iterator.Test2;

/**
 * @author TF014268
 * @description 具体迭代器类
 * @since 2021/6/28 0028 15:10
 */
public class ConcreteIterator extends MyIterator<String>{

    @Override
    public String first() {
        return null;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String currentItem() {
        return null;
    }
}
