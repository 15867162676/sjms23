package strategyTest2;

import java.util.Comparator;

/**
 * @description  狗的身高比较器
 * @author TF014268
 * @since 2021/6/17 0017 16:42
 */
public class DogHigthComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getHight() > o2.getHight()){
            return 1;
        }else if(o1.getHight() < o2.getHight()){
            return -1;
        }else{
            return 0;
        }
    }
}
