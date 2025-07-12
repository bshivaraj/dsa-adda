package leetcode;

public class LetterTiles_1079 {
    public static void main(String[] args) {
        String tiles="AAB";
        int number=getNumber(tiles);
        System.out.println(number);
    }

    private static int getNumber(String tiles) {
        int[] count=new int[26];
        for(char c:tiles.toCharArray()){
            count[c-'A']++;
        }
        return dfs(count);
    }

    private static int dfs(int[] count) {
        int res=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
             res++;
             count[i]--;
             res+=dfs(count);
             count[i]++;
            }
        }
        return res;
    }
}
