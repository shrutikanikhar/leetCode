package kkYoutube;

//1920. Build Array from Permutation
//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class leetCode1920 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={0,2,1,5,3,4};
        //build(arr);
        System.out.println(Arrays.toString(build(arr)));
    }

    static int[] build(int[] arr){
        int[] ans= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]= arr[arr[i]];
        }
        return ans;
    }
}