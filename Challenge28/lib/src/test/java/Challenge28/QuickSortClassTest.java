package Challenge28;

import org.junit.jupiter.api.Test;

import static Challenge28.QuickSortClass.QuickSort;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortClassTest {
    @Test void QuickSortTest(){
        int[] arr ={8,4,23,42,16,15};
        assertArrayEquals(new int []{4,8,15,16,23,42},QuickSort(arr,0,arr.length-1));
    }
}
