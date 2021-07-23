package Iterator.Test2;

/**
 * @author TF014268
 * @description 聚集抽象类
 * @since 2021/6/28 0028 15:08
 */
public abstract class Aggregate<E> {
    //创建迭代器
    public abstract MyIterator<E> createMyIterator();
}
