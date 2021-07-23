package Memento.Demo1;

/**
 * @author TF014268
 * @description 备忘录类
 * @since 2021/7/19 0019 15:42
 */
public class GameProgressMemento {
    private int score;

    public GameProgressMemento(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
