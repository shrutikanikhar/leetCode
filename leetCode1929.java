package kkYoutube;

//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.

import java.util.Arrays;

public class leetCode1929 {
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        System.out.println(Arrays.toString(concat(arr)));
    }
    static int[] concat(int[] arr){
        int n= arr.length;
        int[] arr1= new int[2*arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]= arr[i];
            arr1[i+ n]= arr[i];
        }
        return arr1;
    }
}
