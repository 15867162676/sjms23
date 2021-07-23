package Bridge;

/**
 * @author TF014268
 * @description 正方形
 * @since 2021/6/18 0018 14:33
 */
public class Zheng extends Shape {

    @Override
    void printShape() {
//        System.out.println(super.yanSe.printYanSe()+"正方形");
        System.out.println(super.yanSe.printYanSe() + material.printMaterial()+"正方形");
    }
}
