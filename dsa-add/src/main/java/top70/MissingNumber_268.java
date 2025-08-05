package top70;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums={0,1,3};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int size=nums.length;int temp=0;
        int sum=(size*(size+1))/2;
        for(int i=0;i<size;i++){
            temp=temp+nums[i];
        }
        return sum-temp;

    }
}
