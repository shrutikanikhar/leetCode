package kkYoutube;

//88. Merge Sorted Array
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

import java.util.Arrays;

public class leetCode88 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int[] arr= new int[arr1.length];
        arr = ms(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    static int[] ms(int[] arr1, int m, int[] arr2, int n) {
        for(int i = 0; i < arr2.length; i++){
            arr1[m]= arr2[i];
            m++;
        }

        sort(arr1);

        return arr1;
    }
    static void sort(int[] arr){
        for(int i =0; i< arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j , j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp= arr[second];
        arr[second]= arr[first];
        arr[first]= temp;
    }
}
