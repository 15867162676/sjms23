package Visitor;

/**
 * @author TF014268
 * @description test
 * @since 2021/6/28 0028 17:20
 */
public class MyTest {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
