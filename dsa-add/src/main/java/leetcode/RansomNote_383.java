package leetcode;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "cb", magazine = "aab";
        System.out.println(isRansome(ransomNote,magazine));
    }

    private static boolean isRansome(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, arr[c - 'a']);
            if (i == -1) {
                return false;
            }
            arr[c - 'a'] = i + 1;
        }
        return true;
    }
}
