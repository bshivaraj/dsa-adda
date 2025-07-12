package leetcode;

public class Majority1_169 {
    public static void main(String[] args) {
        int[] arr={2,1,2,1,1,2,1,1,2};
        int res=getMajority(arr);
        System.out.println(res);
    }

    private static int getMajority(int[] arr) {
        int res=arr[0],count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==res){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res=arr[i];
                count++;
            }
        }
        return res;
    }

}
