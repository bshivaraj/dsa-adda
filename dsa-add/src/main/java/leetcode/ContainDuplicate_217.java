package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate_217 {
    public static void main(String[] args) {
        
    int arr1[]={1,2,3,1};
    int arr2[]={1,2,3,4};
        boolean res= extracted(arr2);
        System.out.println(res);
    }

    private static boolean extracted(int[] arr1) {
        Set<Integer> set=new HashSet<>();
        for(int i = 0; i< arr1.length; i++){
            if(!set.add(arr1[i])){
                return true;
            }
        }
        return false;
    }
}
