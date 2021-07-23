package strategyTest2;

/**
 * @description  对特殊类型排序
 * @author TF014268
 * @since 2021/6/17 0017 8:50
 */
public class Sorter2 {
    //排序的方法
    public static void sort(Cat[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j);
            }
        }
    }

    //交换位置的方法
    private static void swap(Cat[] arr,int i,int j){
        if(arr[i].compareTo(arr[j]) > 0){
            Cat temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
