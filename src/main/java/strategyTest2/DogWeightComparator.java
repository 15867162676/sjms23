package strategyTest2;

import java.util.Comparator;

/**
 * @description  狗的重量比较器
 * @author TF014268
 * @since 2021/6/17 0017 16:30
 */
public class DogWeightComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        }else if(o1.getWeight() < o2.getWeight()){
            return -1;
        }else{
            return 0;
        }
    }
}
