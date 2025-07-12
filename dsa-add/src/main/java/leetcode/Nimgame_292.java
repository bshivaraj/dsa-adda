package leetcode;

public class Nimgame_292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(8));
    }

    public static boolean canWinNim(int n) {
        if(n<=3){
            return true;
        }
        if(n>=4){
            int r=n%4;
            if(r==1 ||r==2 || r==3){
                return true;
            }
        }
        return false;
    }
}
