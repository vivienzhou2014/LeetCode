import java.util.HashMap;

public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sT = new HashMap<>();
        HashMap<Character, Character> tS = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(sT.containsKey(cs)){
                System.out.println(sT.get(cs));
                System.out.println(ct);
                if(sT.get(cs) != ct){
                    return false;
                }
            }else{
                sT.put(cs,ct);
            }
            if(tS.containsKey(ct)){
                if(tS.get(ct) != cs){
                    return false;
                }
            }else{
                tS.put(ct,cs);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo", t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
}
