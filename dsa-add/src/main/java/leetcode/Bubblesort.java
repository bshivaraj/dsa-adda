package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Bubblesort {
    public static void main(String[] args) {
       int[] arr={1,2,33,5,78,9,56,40,22};
       int[] sort=getSorted(arr);
         System.out.println(Arrays.toString(sort));
    }

    private static int[] getSorted(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }

}
