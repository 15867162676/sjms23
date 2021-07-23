package Builder.test1;

/**
 * @author TF014268
 * @description 联想电脑构建类
 * @since 2021/6/30 0030 19:11
 */
public class LenovoComputerBuilder extends ComputerBuilder{
    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
