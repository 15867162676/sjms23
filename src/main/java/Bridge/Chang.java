package Bridge;

/**
 * @author TF014268
 * @description 长方形
 * @since 2021/6/18 0018 14:39
 */
public class Chang extends Shape {
    @Override
    void printShape() {
//        System.out.println(super.yanSe.printYanSe() + "长方形");
        System.out.println(super.yanSe.printYanSe()+ material.printMaterial() + "长方形");
    }
}
