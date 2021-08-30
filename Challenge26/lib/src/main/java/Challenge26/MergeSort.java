package Challenge26;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 23, 42, 16, 15};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int[] left = new int[(n + 1) / 2];
            int[] right = new int[n - left.length];
            for (int i = 0; i < n; i++) {
                if (i < left.length) {
                    left[i] = arr[i];
                } else {
                    right[i - left.length] = arr[i];
                }
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }
        return arr;
    }
    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j = j + 1;
            k = k + 1;
        }
    }

}
