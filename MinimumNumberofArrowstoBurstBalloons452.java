import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2)->{//这个是把尾端排序，后面就只用看前端
            if(o1[1] > o2[1]) return 1;
            if(o1[1] < o2[1]) return -1;
            return 0;
        });//比较器，传参传o1,o2,比较时再具体去做
        int arrow = points[0][1];//第一支箭在第一个气球尾端
        int count = 1;//设好了第一支箭所以count是1
        for(int[] balloon : points){
            if(balloon[0] > arrow){//如果当前气球开端在前一个气球尾端之后，需要再射一支箭
                count++;
                arrow = balloon[1];//这支箭射在当前气球尾端
            }
        }
        return count;
    }

}
