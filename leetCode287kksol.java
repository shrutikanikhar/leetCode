package kkYoutube;

import static kkYoutube.cycleSort.swap;

public class leetCode287kksol {
    public static void main(String[] args) {
        int[] arr= {1,4,5,6,2,2};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] arr){
        int i= 0;
        while(i < arr.length){
            if( arr[i] != i+1){
                int correct = arr[i] -1;
                if( arr[i] != arr[correct]){
                    swap( arr, i, correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}
