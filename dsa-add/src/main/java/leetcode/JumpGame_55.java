package leetcode;


public class JumpGame_55 {
    public static void main(String[] args) {
        int[] arr={2,0,1,1,4};
        //int[] arr={3,2,1,1,4};
        boolean res=getJump(arr);
        System.out.println(res);
    }

    private static boolean getJump(int[] arr) {
        int reachable=0;
         if(arr.length==0) {
             return false;
         }
         for(int i=0;i<arr.length;i++){
             if(reachable<i){
                 return false;
             }
             reachable=Math.max(reachable,arr[i]+i);
         }
        return true;
    }
}
