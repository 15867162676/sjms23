package Memento.Demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TF014268
 * @description 备忘录组件类
 * @since 2021/7/19 0019 15:43
 */
public class GameCareTaker {
    private List<GameProgressMemento> memento= new ArrayList<>();

    //保存状态
    public void saveMemento(GameProgressMemento memento) {
        this.memento.add(memento);
    }

    //获得状态
    public GameProgressMemento getMemento(int index) {
        return this.memento.get(index);
    }
}
