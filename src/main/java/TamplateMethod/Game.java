package TamplateMethod;

/**
 * @author TF014268
 * @description 游戏抽象类
 * @since 2021/7/19 0019 19:56
 */
public abstract class Game {

    //模板--一般定义为final
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}
