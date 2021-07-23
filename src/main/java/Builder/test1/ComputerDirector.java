package Builder.test1;

/**
 * @author TF014268
 * @description 指导者类
 * @since 2021/6/30 0030 19:13
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
