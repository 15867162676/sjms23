package Memento.Demo2;

/**
 * @author TF014268
 * @description 需要记录备忘录的类
 * @since 2021/7/19 0019 16:27
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
