package strategyTest2;

/**
 * @description  猫的类
 * @author TF014268
 * @since 2021/6/17 0017 8:51
 */
public class Cat implements Comparable<Cat>{

    //姓名
    private String name;
    //体重
    private double weight;
    //身高
    private double hight;

    public Cat(String name,double weight){
        this.name = name;
        this.weight = weight;
    }

    public Cat(String name,double weight,double hight){
        this.name = name;
        this.weight = weight;
        this.hight = hight;
    }

    @Override
    public int compareTo(Cat cat2){
        if(this.weight > cat2.weight){
            return 1;
        }else if(this.weight < cat2.weight){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
