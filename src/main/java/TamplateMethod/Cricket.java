package TamplateMethod;

/**
 * @author TF014268
 * @description 板球游戏类
 * @since 2021/7/19 0019 19:57
 */
public class Cricket extends Game{
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
