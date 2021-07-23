package strategyTest2;

import java.util.Arrays;
import java.util.Comparator;

public class MyTest1 {

    //数字排序
    public static void numberSort(){
        int[] arr = {5,3,4,2,1};
        Sorter.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    //猫排序
    public static void catSort(){
        Cat[] catArr = {new Cat("小白",2.3),new Cat("小黑",1.6),new Cat("花花",1.9)};
        Sorter3.sort(catArr);
        Arrays.stream(catArr).forEach(System.out::println);
    }

    //狗排序
    public static void dogSort(){
        Dog[] catArr = {new Dog("小白",2.3),new Dog("小黑",1.6),new Dog("花花",1.9)};
        Sorter4 sorter4 = new Sorter4();
        sorter4.sort(catArr, new Comparator<Dog>() {
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
        });
        Arrays.stream(catArr).forEach(System.out::println);
    }

    //狗排序
    public static void dogSort2(){
        Dog[] catArr = {new Dog("小白",2.3,0.9),new Dog("小黑",1.6,3.9),new Dog("花花",1.9,0.2)};
        Sorter4 sorter4 = new Sorter4();

        System.out.println("按体重排序-----------------------");
        sorter4.sort(catArr, new DogWeightComparator());
        Arrays.stream(catArr).forEach(System.out::println);

        System.out.println("按身高排序-----------------------");
        sorter4.sort(catArr, new DogHigthComparator());
        Arrays.stream(catArr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        dogSort2();
    }
}
