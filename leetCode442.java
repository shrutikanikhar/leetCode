package kkYoutube;

//442. FIND ALL THE DUPLICATES
//Medium
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

import java.util.ArrayList;
import java.util.List;

import static kkYoutube.cycleSort.swap;

public class leetCode442 {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        //cyclic(arr);
        System.out.println(cyclic(arr));

    }
    static List<Integer> cyclic(int[] nums){
        int i= 0;
        while(i< nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans= new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                int n= nums[j];
                ans.add(n);
            }

        }

        return ans;
    }
}
