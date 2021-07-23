package strategyTest2;

import java.util.Comparator;

/**
 * @description  狗的类
 * @author TF014268
 * @since 2021/6/17 0017 8:51
 */
public class Dog{

    //姓名
    private String name;
    //体重
    private double weight;
    //身高
    private double hight;

    public Dog(){
    }

    public Dog(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, double weight, double hight){
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", hight=" + hight +
                '}';
    }
}
