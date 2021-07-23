package strategyTest2;

/**
 * @descrption  排序方法
 * @author TF014268
 * @since 2021/6/17 0017 8:11
 */
public class Sorter {

    //排序的方法
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j);
            }
        }
    }

    //交换位置的方法
    private static void swap(int[] arr,int i,int j){
        if(arr[i] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

}
