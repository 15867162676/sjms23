package Memento.Demo2;

/**
 * @author TF014268
 * @description 备忘录类
 * @since 2021/7/19 0019 16:26
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
