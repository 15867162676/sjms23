package Bridge;

/**
 * @description  形状类
 * @author TF014268
 * @since 2021/6/18 0018 14:16
 */
public abstract class Shape {
    //颜色接口
    YanSe yanSe;
    //材料接口
    Material material;


    public void setYanSe(YanSe yanSe){
        this.yanSe = yanSe;
    }

    public void setMaterial(Material material){
        this.material = material;
    }

    //打印形状的方法
    abstract void printShape();
}
