package Challenge26;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(array)));

        int[] array1 = {20,18,12,8,5,-2};
        System.out.println(Arrays.toString(insertionSort(array1)));
    }

    public static int[] insertionSort(int[] arr){
        if(arr.length<=1)
            return arr;

        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
