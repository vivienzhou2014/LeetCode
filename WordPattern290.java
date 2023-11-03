import java.util.HashMap;

public class WordPattern290 {
    public static boolean wordPattern1(String pattern, String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) {return false;}
        for(Integer i = 0; i < pattern.length(); i++){
            String p = "p_" + pattern.charAt(i);
            String as = "s_" + arr[i];
            System.out.println("p: "+ p+ "s: " + as);
            if(!map.containsKey(p)){map.put(p,i);}
            if(!map.containsKey(as)){map.put(as,i);}
            if(map.get(p) != map.get(as)){return false;}
        }
        return true;
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> sp = new HashMap<>();
        HashMap<Character, String> ps = new HashMap<>();
        String[] sarr = s.split(" ");
        if(sarr.length != pattern.length()) return false;
        for(Integer i = 0; i < pattern.length(); i++){
            char p = pattern.charAt(i);
            String sa = sarr[i];
            if(sp.containsKey(sa) && sp.get(sa) != p)return false;
            if(ps.containsKey(p) && !ps.get(p).equals(sa))return false;
            if(!sp.containsKey(sa)) sp.put(sa,p);
            if(!ps.containsKey(p)) ps.put(p,sa);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        System.out.println(wordPattern(pattern, s));
    }
}
