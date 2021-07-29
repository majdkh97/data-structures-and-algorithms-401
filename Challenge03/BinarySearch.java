package com.example.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {4,8,15,16,23,42};
        int n1 = binarySearch(arr1,15);
        System.out.println(n1);

        int[] arr2 = {-131, -82, 0, 27, 42, 68, 179};
        int n2 = binarySearch(arr2,42);
        System.out.println(n2);

        int[] arr3 = {11, 22, 33, 44, 55, 66, 77};
        int n3 = binarySearch(arr3,90);
        System.out.println(n3);

        int[] arr4 = {1, 2, 3, 5, 6, 7};
        int n4 = binarySearch(arr4,4);
        System.out.println(n4);
    }

    public static int binarySearch(int[] arr ,int key){
        int n = arr.length;
        int l = 0 ;
        int r = n - 1;
        int m = 0;
        while(l<=r){
            m = (l+r)/2;
            if(arr[m]<key){
                l = m+1;
            }
            else if (arr[m]>key){
                r = m-1;
            }
            else
                return m;
        }
        return -1;
    }

}
