package Memento.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 备忘录操作类
 * @since 2021/7/19 0019 16:28
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    //往备忘录中添加
    public void add(Memento state){
        mementoList.add(state);
    }

    //从备忘录中获取
    public Memento get(int index){
        return mementoList.get(index);
    }
}
