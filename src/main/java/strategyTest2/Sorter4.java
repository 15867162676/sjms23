package strategyTest2;

import java.util.Comparator;

/**
 * @description  对特殊类型排序
 * @author TF014268
 * @since 2021/6/17 0017 8:50
 */
public class Sorter4<T> {
    //排序的方法
    public void sort(T[] arr, Comparator<T> comparator){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                swap(arr,i,j,comparator);
            }
        }
    }

    //交换位置的方法
    private void swap(T[] arr,int i,int j,Comparator<T> comparator){
        if(comparator.compare(arr[i],arr[j]) > 0){
            T temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
