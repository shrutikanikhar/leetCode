package kkYoutube;
import java.util.*;

public class leetCode448 {
    public static void main(String[] args) {
        int[] arr= {3,0};
        cyclic(arr);
        System.out.println(cyclic(arr));
    }

    static List<Integer> cyclic(int[] arr){
        int i=0;
        while(i< arr.length){
            int correct= arr[i];
            if(arr[i] < arr.length && arr[i] !=arr[correct] ){
                swap(arr, i , correct);
            }else{
                i++;
            }
        }

        List<Integer> ans= new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(j+1);

            }
        }


        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[second];
        arr[second]= arr[first];
        arr[first]= temp;
    }
}
