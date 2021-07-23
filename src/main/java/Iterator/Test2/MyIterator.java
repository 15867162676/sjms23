package Iterator.Test2;

/**
 * @author TF014268
 * @description 迭代器抽象类
 * @since 2021/6/28 0028 15:04
 */
public abstract class MyIterator<E> {
    //获取第一个元素
    public abstract E first();

    //获取下一个元素
    public abstract E next();

    //是否有下个元素
    public abstract boolean hasNext();

    //获取当前的元素
    public abstract E currentItem();
}
