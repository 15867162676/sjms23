package Builder.test1;

/**
 * @author TF014268
 * @description 苹果电脑构建类
 * @since 2021/6/30 0030 8:56
 */
public class MacComputerBuilder extends ComputerBuilder{
    private Computer computer;
    public MacComputerBuilder(String cpu,String ram){
        computer=new Computer(cpu,ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
