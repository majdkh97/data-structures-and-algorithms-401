package Challenge28;

import java.util.Arrays;

public class QuickSortClass {
    public static void main(String[] args) {
        int[] arr ={8,4,23,42,16,15};
        System.out.println(Arrays.toString(QuickSort(arr,0,arr.length-1)));
    }
    static int[] QuickSort(int[] arr,int left, int right){
        if(left<right){
            int position = Partition(arr,left,right);
            QuickSort(arr,left,position-1);
            QuickSort(arr,position+1,right);
        }
        return arr;
    }
    static int Partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left-1;
        for(int i = left; i<right ; i++){
            if(arr[i]<=pivot){
                low = low + 1;
                Swap(arr,i,low);
            }
        }
        Swap(arr,right,low+1);
        return (low+1);
    }

     static void Swap(int[] arr, int i, int low){
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low]=temp;
    }
}
