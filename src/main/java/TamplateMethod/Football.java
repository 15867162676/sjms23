package TamplateMethod;

/**
 * @author TF014268
 * @description 足球游戏
 * @since 2021/7/19 0019 19:58
 */
public class Football extends Game{
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
