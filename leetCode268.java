package kkYoutube;

import java.util.Arrays;


public class leetCode268 {
    public static void main(String[] args) {
        int[] arr= {3,0,1};
        cyclic(arr);
        System.out.println(cyclic(arr));
    }

    static int cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct= arr[i];
            if(arr[i] < arr.length && arr[i] !=arr[correct] ){
                swap(arr, i , correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[second];
        arr[second]= arr[first];
        arr[first]= temp;
    }
}
