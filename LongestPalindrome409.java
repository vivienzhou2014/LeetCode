import java.util.HashMap;

public class LongestPalindrome409 {
    public int longestPalindrome1(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len = 0;
        for(int count:map.values()){
            if(count % 2 ==0){
                len += count;
            }else{
                len += count-1;
            }
        }
        if(len < s.length()){
            len++;
        }
        return len;
    }
    public int longestPalindrome(String s) {
        int length = Math.max('z'-'A', 'Z'-'a');
        int[] map = new int[length];
        for(char c: s.toCharArray()){
            map[(c -'a' + length) % length] +=1;
        }
        int len = 0;
        for(int count:map){
            len += count - (count & 1);
        }
        if(len < s.length()){
            len++;
        }
        return len;
    }
}
