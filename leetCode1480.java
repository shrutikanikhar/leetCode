package kkYoutube;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.

public class leetCode1480 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
