package Challenge26;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Challenge26.InsertionSort.insertionSort;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    @Test
    public void insertionSortTest(){
        int[] array = {7,4,23,69,3,17};
        int[] sortedArray = insertionSort(array);
        assertArrayEquals(new int[]{3, 4, 7, 17, 23, 69},sortedArray);

        int[] array1 = {};
        int[] sortedArray1 = insertionSort(array1);
        assertArrayEquals(new int[]{},sortedArray1);

        int[] array2 = {5};
        int[] sortedArray2 = insertionSort(array2);
        assertArrayEquals(new int[]{5},sortedArray2);

        int[] array3 = {1,2,3,4};
        int[] sortedArray3 = insertionSort(array3);
        assertArrayEquals(new int[]{1,2,3,4},sortedArray3);
    }
}
