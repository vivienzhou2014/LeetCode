import java.util.HashMap;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){return false;}
        for(int i = 0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            map.put(cs, map.getOrDefault(cs,0)+1);
            map.put(ct, map.getOrDefault(ct,0)-1);
        }
        for(Integer value: map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        int[] map = new int[26];
        if(s.length() != t.length()){return false;}
        for(int i = 0; i<s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<t.length(); i++){
            int index = t.charAt(i) - 'a';
            map[index]--;
            if(map[index]<0){return false;}
        }
        return true;
    }
}
