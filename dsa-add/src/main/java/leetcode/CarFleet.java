package leetcode;

public class CarFleet {
    public static void main(String[] args) {

        int target = 12;
        int[] position = {10,8,0,5,3} ,speed = {2,4,1,1,3};
        int res=getNumberOfCarFleet(position,speed,target);
        System.out.println(res);

    }

    private static int getNumberOfCarFleet(int[] position, int[] speed, int target) {
        int carfleet=0;
        if(position.length==0 || speed.length==0){
            return carfleet;
        }
        for(int i=0;i<position.length;i++){
            if((position[i]+speed[i]==target )|| position[i]==0){
                carfleet++;
            }
        }
        return carfleet;
    }
}
