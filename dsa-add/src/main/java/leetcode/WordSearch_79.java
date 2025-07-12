package leetcode;

public class WordSearch_79 {
    public static void main(String[] args) {
        String word="ABCCED";
        char[][] board={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        boolean isWordFound=getWordSearch(board,word);
        System.out.println(isWordFound);
    }

    private static boolean getWordSearch(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && bt(board,i,j,word,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bt(char[][] board, int i, int j,String word, int index) {
        if (word.length() == index) {
            return true;
        }

        if(i<0 || j<0 || i>board.length || j>board.length){
            return false;
        }

        if(word.charAt(index)!=board[i][j]){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='*';

        if(bt(board, i + 1, j, word, index + 1) ||
                bt(board, i - 1, j, word, index + 1) ||
                bt(board, i, j + 1, word, index + 1) ||
                bt(board, i, j - 1, word, index + 1)){
            return true;
        }

        return false;
    }
}
