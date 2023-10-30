import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            //map.put(key, map.getOrDefault(key, new ArrayList<String>()).add(str));
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);//上面的方法不行因为是value是List不是ArrayList
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());//ArrayList(Collection<? extends E> c)
    }
}
