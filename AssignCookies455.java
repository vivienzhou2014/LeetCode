import java.util.Arrays;

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while(child < g.length && cookie < s.length){
            if(g[child] <= s[cookie]){
                child++;//满足条件，得到饼干，下一个孩子
            }
            cookie++;//满足条件也是下一个饼干，因为上一个给出去了，不满足条件也是下一个饼干，因为是升序，这个都不满足后面的小孩也满足不了，只能往后看后面的饼干能不能满足
        }
        return child;
    }

}
