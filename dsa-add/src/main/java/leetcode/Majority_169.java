package leetcode;

import java.util.Arrays;
import java.util.List;

public class Majority_169 {
    public static void main(String[] args) {
        //int[] arr={1,2,1,1,4,5,1,4};
        int[] arr={2,1,2,1,1,2,1,1,2};
        List.of(arr);
        int res=getMostNumber(arr);
        System.out.println(res);
    }

    private static int getMostNumber(int[] arr) {
        int repNum=arr[0],count=1;
        for(int i=1;i<arr.length;i++){
          if(repNum==arr[i]){
              count++;
          }else{
              count--;
          }
          if(count==0){
              repNum=arr[i];
              count++;
          }
        }
        return repNum;
    }
}
