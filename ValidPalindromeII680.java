public class ValidPalindromeII680 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return checkP(s, i+1, j) || checkP(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean checkP(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
