package Iterator.Test1;

/**
 * @author TF014268
 * @description 我的list--实现扩容功能
 * @since 2021/6/25 0025 16:47
 */
public class MyList implements MyCollection,MyIterator{
    //初始容量为5
    Object[] objects = new Object[5];

    //标记数组中元素的个数（或下一个空的位置在哪）
    private int index = 0;

    @Override
    public void add(Object object){
        if(index == objects.length){
            //扩容
            Object[] newObjects = new Object[objects.length*2];
            //把元素copy到扩容后的数组中
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        //添加新元素
        objects[index] = object;
        index++;
    }

    //list中元素的个数
    @Override
    public int size(){
        return index;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
