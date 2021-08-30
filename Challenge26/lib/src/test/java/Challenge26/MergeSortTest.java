package Challenge26;

import org.junit.jupiter.api.Test;


import static Challenge26.MergeSort.mergeSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MergeSortTest {
    @Test
    public void mergeSortTests(){
        int[] arr = {7,4,23,69,3,17};
        int[] sortedArray = mergeSort(arr);
        assertArrayEquals(new int[]{3, 4, 7, 17, 23, 69},sortedArray);

        int[] array1 = {};
        int[] sortedArray1 = mergeSort(array1);
        assertArrayEquals(new int[]{},sortedArray1);

        int[] array2 = {5};
        int[] sortedArray2 = mergeSort(array2);
        assertArrayEquals(new int[]{5},sortedArray2);

        int[] array3 = {1,2,3,4};
        int[] sortedArray3 = mergeSort(array3);
        assertArrayEquals(new int[]{1,2,3,4},sortedArray3);
    }
}
