package kkYoutube;
//41. First Missing Positive
//Given an unsorted integer array nums, return the smallest missing positive integer.

import java.util.Arrays;

import static kkYoutube.cycleSort.swap;

public class leetCode41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        //fmpov(nums);
        System.out.println(fmpov(nums));
    }
    static int fmpov(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }


        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j + 1;
            }
        }
        return nums.length+1;
    }
}

