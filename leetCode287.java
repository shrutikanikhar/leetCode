package kkYoutube;
import static kkYoutube.leetCode448.swap;

public class leetCode287 {
    public static void main(String[] args) {
        int[] arr= {1,3,4,2,2};
        cyclic(arr);
        System.out.println(arr[arr.length-1]);
    }

    static void cyclic(int[] arr){
        int i=0;
        int answer= 0;
        while (i < arr.length){
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;
            }
        }
    }
}
