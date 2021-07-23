package Iterator.Test1;

/**
 * @author TF014268
 * @description 我的迭代器接口
 * @since 2021/6/28 0028 10:38
 */
public interface MyIterator<E> {
    //是否有下个元素
    boolean hasNext();

    //获取下一个元素
    E next();
}
